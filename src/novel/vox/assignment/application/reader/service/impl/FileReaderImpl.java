package novel.vox.assignment.application.reader.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import novel.vox.assignment.application.reader.service.FileReader;
import novel.vox.assignment.data.objects.FileObject;
import novel.vox.assignment.data.objects.InternetSpeedDetails;

public class FileReaderImpl implements FileReader {

	@Override
	public FileObject read(String path, String filename) {

		FileObject fileObj = new FileObject();

		try (BufferedReader br = new BufferedReader(new java.io.FileReader(path + filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				fileObj.setFileElement((InternetSpeedDetails.build(line.split(","))));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileObj;

	}

}
