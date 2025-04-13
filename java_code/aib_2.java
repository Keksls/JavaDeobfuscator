/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.URLConnection;

/*
 * Renamed from aIB
 */
public class aib_2
extends air_1<aiz_1> {
    private static final String b = "ETag";
    private static final String c = "Last-Modified";
    private static final String d = "Wakfu/1.x";
    private final String e;
    private String f;

    public aib_2(String string) {
        this.e = string;
    }

    @Override
    public boolean a() {
        try {
            URLConnection uRLConnection = ((aiz_1)this.a).e().openConnection();
            uRLConnection.addRequestProperty("User-Agent", d);
            String string = null;
            int n = 0;
            while (true) {
                String string2 = uRLConnection.getHeaderFieldKey(n);
                String string3 = uRLConnection.getHeaderField(n);
                if (string2 == null && string3 == null) break;
                if (b.equals(string2)) {
                    string = string3;
                    break;
                }
                if (c.equals(string2)) {
                    string = string3;
                }
                ++n;
            }
            this.f = string;
            return this.f != null && this.f.equals(this.e);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }
}

