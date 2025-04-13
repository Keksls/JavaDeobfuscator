/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from aMi
 */
public class ami_1
implements amf_1 {
    private static final Logger a = Logger.getLogger(ami_1.class);
    private final String b;
    private final String[] c;

    public ami_1(String string, String ... stringArray) {
        this.b = string;
        this.c = stringArray;
    }

    @Override
    public amx_1 a(long l) {
        String string = this.b + l + ".";
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            String string2 = string + this.c[k];
            gj_0.a(string2);
            try {
                URL uRL = gg_0.d(string2);
                if (!cd_0.a(uRL)) continue;
                return new amf_2(uRL);
            }
            catch (MalformedURLException malformedURLException) {
                a.error((Object)("URL malform\u00e9e \u00e0 partie de l'ID sp\u00e9cifi\u00e9: result=" + string2));
            }
        }
        a.error((Object)("Impossible de trouver le fichier d'id " + l + " dans le path " + this.b));
        return null;
    }
}

