package novel.vox.assignment;

import novel.vox.assignment.application.reader.service.impl.FileReaderImpl;
import novel.vox.assignment.data.objects.FileObject;

public class ApplicationLauncher {

	public static void main(String[] s) {

		FileObject fileObject = new FileReaderImpl().read(s[0], s[1]);

	}
}
