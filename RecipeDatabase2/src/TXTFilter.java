import java.io.File;

import javax.swing.filechooser.FileFilter;

public class TXTFilter extends FileFilter {
	private final String[] okFileExt = new String[] { ".txt" };

	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}

		for (String ext : okFileExt) {
			if (file.getName().toLowerCase().endsWith(ext)) {
				return true;
			}
		}

		return false;
	}

	public String getDescription() {
		return ".txt";
	}
}
