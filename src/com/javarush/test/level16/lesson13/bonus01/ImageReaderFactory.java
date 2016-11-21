package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes imageType) {

        if (imageType == ImageTypes.BMP)
                return new BmpReader();
        if (imageType == ImageTypes.JPG)
                return new JpgReader();
        if (imageType == ImageTypes.PNG)
                return new PngReader();

        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
