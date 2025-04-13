/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from aAO
 */
public class aao_2 {
    protected static final Logger a = Logger.getLogger(aao_2.class);

    public static void a(String[] stringArray) {
        if (stringArray.length != 3) {
            a.error((Object)"arguments : source.jar patchfile.jar outputpatchedfile.jar");
        } else {
            String string = stringArray[0];
            String string2 = stringArray[1];
            String string3 = stringArray[2];
            try {
                a.info((Object)("Applying patch " + string2 + " to file " + string + " => " + string3));
                FileOutputStream fileOutputStream = new FileOutputStream(string3);
                new aas_2().a(null, string, string2, fileOutputStream);
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                a.error((Object)"IOException during JPatch main", (Throwable)iOException);
            }
        }
    }
}

