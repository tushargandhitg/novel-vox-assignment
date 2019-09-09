package novel.vox.assignment.application.general.calculations.service.impl;

import java.util.List;

import novel.vox.assignment.application.general.calculations.service.GeneralCalculationsService;
import novel.vox.assignment.data.objects.FileObject;
import novel.vox.assignment.data.objects.InternetSpeedDetails;

public class GeneralCalculationServiceImpl implements GeneralCalculationsService {

	@Override
	public void monthlyHighestSpeed(FileObject fileObj) {

		List<InternetSpeedDetails> fileList = fileObj.getFileList();
		
		
		
		fileList.parallelStream().forEach(singleEntity -> {

			
			
			
		});

	}

}
