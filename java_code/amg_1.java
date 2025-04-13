/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import org.apache.log4j.Logger;

/*
 * Renamed from aMg
 */
public class amg_1
implements amf_1 {
    private static final Logger a = Logger.getLogger(amg_1.class);
    private String b;
    private final String[] c;

    public amg_1(String string, String ... stringArray) {
        this.b = string;
        this.c = stringArray;
    }

    public void a(String string) {
        this.b = string;
    }

    @Override
    public amx_1 a(long l) {
        String string = this.b + l + ".";
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            String string2 = string + this.c[k];
            gj_0.a(string2);
            File file = new File(string2);
            if (!file.exists()) continue;
            return new amy_1(file);
        }
        a.error((Object)("Impossible de trouver le fichier d'id " + l + " dans le path " + this.b));
        return null;
    }
}

