/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.programming_documents.document;

import com.aspose.words.*;
import com.aspose.words.examples.Utils;


public class DocumentBuilderInsertFloatingImage {
    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DocumentBuilderInsertFloatingImage.class);

        // Open the document.
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.insertImage(dataDir + "test.jpg",
                RelativeHorizontalPosition.MARGIN,
                100,
                RelativeVerticalPosition.MARGIN,
                100,
                200,
                100,
                WrapType.SQUARE);

        doc.save(dataDir + "output.doc");

        //ExEnd:1
    }
}