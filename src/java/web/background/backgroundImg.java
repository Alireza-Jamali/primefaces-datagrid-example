/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.background;

import java.util.concurrent.ThreadLocalRandom;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hajipour
 */
@ManagedBean
public class backgroundImg {
    private String bgImages;

    public String getBgImages() {
        return bgImages = "images/loginpage/bg" + ThreadLocalRandom.current().nextInt(1, 3) + ".jpg";
    }

    public void setBgImages(String bgImages) {
        this.bgImages = bgImages;
    }
    
}
