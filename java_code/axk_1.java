/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.util.VersionNumberString
 *  jogamp.opengl.GLVersionNumber
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.jogamp.common.util.VersionNumberString;
import jogamp.opengl.GLVersionNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from axK
 */
public class axk_1
extends axg_1 {
    private static final Logger c = LoggerFactory.getLogger(axk_1.class);

    @Override
    public boolean b() {
        if (!ahu_2.c()) {
            c.debug("Doesn't have {} because OS is not Windows", (Object)this.d());
            return false;
        }
        if (!ava_2.a.a(this.b)) {
            c.debug("Doesn't have {} because vendor is not AMD", (Object)this.d());
            return false;
        }
        String string = this.b.glGetString(7938);
        VersionNumberString versionNumberString = GLVersionNumber.createVendorVersion((String)string);
        int n = versionNumberString.getMajor();
        int n2 = versionNumberString.getMinor();
        int n3 = versionNumberString.getSub();
        if (n != 22 && n != 23) {
            c.debug("Doesn't have {} because version major isn't 22 or 23 (vendor version {})", (Object)this.d(), (Object)versionNumberString);
            return false;
        }
        if (n == 22 && n2 < 7) {
            c.debug("Doesn't have {} because version major is 22 and version minor are inferior to 7 (vendor version {})", (Object)this.d(), (Object)versionNumberString);
            return false;
        }
        if (n == 22 && n2 == 7 && n3 < 1) {
            c.debug("Doesn't have {} because version major is 22 and version minor is 7 and version sub are inferior to 1 (vendor version {})", (Object)this.d(), (Object)versionNumberString);
            return false;
        }
        if (n == 23 && n2 > 7) {
            c.debug("Doesn't have {} because version major is 23 and version minor are superior to 7 (vendor version {})", (Object)this.d(), (Object)versionNumberString);
            return false;
        }
        if (n == 23 && n2 == 7 && n3 > 0) {
            c.debug("Doesn't have {} because version major is 23 and version minor is 7 and version sub are superior to 0 (vendor version {})", (Object)this.d(), (Object)versionNumberString);
            return false;
        }
        String string2 = versionNumberString.getVersionString();
        if (string2.contains(".Q") || string2.contains(".q")) {
            c.debug("Doesn't have {} because vendor version version string contains q (PRO driver) (vendor version {})", (Object)this.d(), (Object)versionNumberString);
            return false;
        }
        return true;
    }

    @Override
    public axx_2 d() {
        return axx_2.k;
    }
}

