/******************************************************************************
Copyright � 2016 Capgemini Group of companies. All rights reserved
(Subject to Limited Distribution and Restricted Disclosure Only.)
THIS SOURCE FILE MAY CONTAIN INFORMATION WHICH IS THE PROPRIETARY
INFORMATION OF Capgemini GROUP OF COMPANIES AND IS INTENDED FOR USE
ONLY BY THE ENTITY WHO IS ENTITLED TO AND MAY CONTAIN
INFORMATION THAT IS PRIVILEGED, CONFIDENTIAL, OR EXEMPT FROM
DISCLOSURE UNDER APPLICABLE LAW.
YOUR ACCESS TO THIS SOURCE FILE IS GOVERNED BY THE TERMS AND
CONDITIONS OF AN AGREEMENT BETWEEN YOU AND Capgemini GROUP OF COMPANIES.
The USE, DISCLOSURE REPRODUCTION OR TRANSFER OF THIS PROGRAM IS
RESTRICTED AS SET FORTH THEREIN.
******************************************************************************/

package com.cg.digi.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.digi.dao.IDigitalQADao;
import com.cg.digi.model.Batch;
import com.cg.digi.model.Comparisionreport;
import com.cg.digi.model.Defect;
import com.cg.digi.model.ExecutionResults;
import com.cg.digi.model.Question;
import com.cg.digi.model.Results;
import com.cg.digi.model.Survey;
import com.cg.digi.model.Task;
import com.cg.digi.model.Testcase;
import com.cg.digi.utilities.FileUtils;
import com.cg.digi.utilities.PDFComparerUtil;

/**
 * @author hapemmas
 *
 */

@Component("digiQAService")
public class DigitalQAServiceImpl implements IDigitalQAService {

	@Autowired
	IDigitalQADao digitalQADao;

	@Override
	public Testcase addManualTestCases(Testcase testcase, String userid) {
		return digitalQADao.addManualTestCases(testcase, userid);
	}

	@Override
	public List<Testcase> getAllTestcases(String toolid) {
		return digitalQADao.getAllTestcases(toolid);
	}

	@Override
	public int addTestcasestoBatch(String[] data, String batchid) {
		return digitalQADao.addTestcasestoBatch(data, batchid);
	}

	@Override
	public List<Batch> getAllAllocatedBatches(String userid) {
		return digitalQADao.getAllAllocatedBatches(userid);
	}

	@Override
	public List<Testcase> getAllocatedTestcasesToUser(String batchid) {
		return digitalQADao.getAllocatedTestcasesToUser(batchid);
	}

	@Override
	public boolean updateTestcaseResults(Testcase testcase, String userid, double passCount, double failCount,
			double total) {
		return digitalQADao.updateTestcaseResults(testcase, userid, passCount, failCount, total);
	}

	@Override
	public List<ExecutionResults> getExecutionResults(String batchid) {
		return digitalQADao.getExecutionResults(batchid);
	}

	@Override
	public boolean logDefect(Defect defect) {
		return digitalQADao.logDefect(defect);
	}

	@Override
	public boolean addSuggest(Defect defect) {
		return digitalQADao.addSuggest(defect);
	}

	@Override
	public List<Survey> getUsers(String surveyid) {
		return digitalQADao.getUsers(surveyid);
	}

	@Override
	public List<Results> getResults(String surveyid) {
		// TODO Auto-generated method stub
		return digitalQADao.getResults(surveyid);
	}

	@Override
	public List<Task> getTasks(String surveyid) {
		return digitalQADao.getTasks(surveyid);
	}

	@Override
	public List<Question> getQuestions(String surveyid) {
		return digitalQADao.getQuestions(surveyid);
	}

	@Override
	public List<Results> getQuestionResults(String surveyid) {
		return digitalQADao.getQuestionResults(surveyid);
	}

	@Override
	public File getFinalPath(String documentTestingBase, String projectName, String userName) {
		File baseFolder = FileUtils.createFolder(documentTestingBase, projectName);
		baseFolder = FileUtils.createFolder(baseFolder.getAbsolutePath(), userName);
		long date = System.currentTimeMillis();
		baseFolder = FileUtils.createFolder(baseFolder.getAbsolutePath(), date + "");

		return baseFolder;
	}

	@Override
	public boolean documentTest(String baseDocument, String baseFilePath, String actualDocument, String actualFilePath,
			String resultPath, String userid) {
		fetchNCompare(baseFilePath, actualFilePath, resultPath);

		digitalQADao.documentTest(baseDocument, baseFilePath.replace("\\", "/"), actualDocument,
				actualFilePath.replace("\\", "/"), resultPath.replace("\\", "/"), userid);

		return true;
	}

	void fetchNCompare(String baseFilePath, String actualFilePath, String resultPath) {

		File actualFileFolder = new File(actualFilePath);
		File[] files = actualFileFolder.listFiles();
		for (File f : files) {
			if (f.isFile()) {

				if (f.getName().contains(".pdf")) {
					try {
						PDFComparerUtil.pdfComparer(baseFilePath, f.getAbsolutePath(), resultPath);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else if (f.isDirectory()) {
				fetchNCompare(baseFilePath, f.getAbsolutePath(), resultPath);
			}

		}

	}

	@Override
	public List<Comparisionreport> getDocumentTestReport(String projectid) {
		return digitalQADao.getDocumentTestReport(projectid);
	}

	@Override
	public boolean deleteReport(String reportid) {
		return digitalQADao.deleteReport(reportid);
	}

}
