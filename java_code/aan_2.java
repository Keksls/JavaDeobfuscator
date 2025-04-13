/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.log4j.Logger;

/*
 * Renamed from aAN
 */
public class aan_2 {
    protected static final Logger a = Logger.getLogger(aan_2.class);

    public static void a(String[] stringArray) {
        if (stringArray.length != 3) {
            a.error((Object)"arguments : source1.jar source2.jar outputpatch.jar");
        } else {
            String string = stringArray[0];
            String string2 = stringArray[1];
            String string3 = stringArray[2];
            try {
                a.info((Object)("Creating patch file : " + string3 + ", source1 : " + string + ", source2 : " + string2));
                FileOutputStream fileOutputStream = new FileOutputStream(string3);
                aap_2.a(string, string2, fileOutputStream, true);
                ((OutputStream)fileOutputStream).close();
            }
            catch (IOException iOException) {
                a.error((Object)"IOException during JDiff main", (Throwable)iOException);
            }
        }
    }
}

