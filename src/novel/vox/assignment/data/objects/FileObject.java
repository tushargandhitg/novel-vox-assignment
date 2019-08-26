package novel.vox.assignment.data.objects;

import java.util.ArrayList;
import java.util.List;

public class FileObject {

	private List<InternetSpeedDetails> fileList;

	public FileObject() {
		fileList = new ArrayList<>();
	}

	public void setFileElement(InternetSpeedDetails details) {
		fileList.add(details);
	}

	public List<InternetSpeedDetails> getFileList(){
		return fileList;
	}
	
}
