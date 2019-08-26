package novel.vox.assignment.application.reader.service;

import novel.vox.assignment.data.objects.FileObject;

public interface FileReader {

	public FileObject read(String path, String filename);
}
