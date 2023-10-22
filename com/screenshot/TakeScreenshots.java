package com.screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import com.base.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshots {

	public void captureFullPageScreenShot(String filename) throws IOException {
		Date date = new Date();
		String screenshot = date.toString().replace(":", "_").replace(":", "_");

		AShot ashot = new AShot();
		BufferedImage img = ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000))
				.takeScreenshot(BaseClass.driver).getImage();
		String dir = System.getProperty("user.dir");
		ImageIO.write(img, "png",
				new File(dir + "\\src\\main\\resources\\FailedTestCases\\" + screenshot + filename + ".png"));
	}

}
