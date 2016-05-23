package com.aspose.words.examples.loading_saving;

import com.aspose.words.Document;
import com.aspose.words.FileFormatInfo;
import com.aspose.words.FileFormatUtil;
import com.aspose.words.LoadFormat;
import com.aspose.words.examples.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OpenFile {
    public static void main(String[] args) throws Exception {
        // ExStart:OpenFile
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(OpenFile.class);
        String filename = "Test.docx";

        Document doc = new Document(dataDir + filename);
       //ExEnd:OpenFile

    }

}
