/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from bVD
 */
public class bvd_0
implements ajh_1 {
    private static final Logger f = Logger.getLogger(bvd_0.class);
    private static final float g = 100.0f;
    private static final float h = 100.0f;
    public static final String a = "title";
    public static final String b = "hasVideo";
    public static final String d = "video";
    public static final String e = "url";
    private static final String[] i = new String[]{"title", "hasVideo", "video", "url"};
    private final ArrayList<bvg_0> j = new ArrayList();
    private final ArrayList<bvh_0> k = new ArrayList();
    private final asv_1 l;
    private fso m;

    public bvd_0(asv_1 asv_12) {
        this.l = asv_12;
        block4: for (asp_1 asp_12 : asv_12.h()) {
            switch (asp_12.b()) {
                case b: {
                    this.j.add(new bvg_0(asp_12));
                    continue block4;
                }
                case a: {
                    this.k.add(new bvh_0(asp_12));
                    continue block4;
                }
            }
        }
    }

    public ArrayList<bvg_0> a() {
        return this.j;
    }

    public ArrayList<bvh_0> b() {
        return this.k;
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.l.c();
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(d)) {
            if (!this.e()) {
                return null;
            }
            return this.c();
        }
        if (string.equals(e)) {
            return Optional.ofNullable(this.l).map(asv_1::e).map(URL::toString).orElse(null);
        }
        return null;
    }

    public bvh_0 c() {
        return this.k.get(0);
    }

    public boolean e() {
        return !this.k.isEmpty();
    }

    public fso f() {
        this.m = fso.checkOut();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        this.m.setLayoutData(fid_12);
        asq_1 asq_12 = this.l.g();
        if (asq_12 == null) {
            f.warn((Object)("No background for news " + this.l));
            return this.m;
        }
        if (!asq_12.c()) {
            fbf_1 fbf_12 = new fbf_1();
            fbf_12.onCheckOut();
            fbf_12.setColor(asq_12.b());
            this.m.getAppearance().add(fbf_12);
            this.m.onChildrenAdded();
            return this.m;
        }
        ast_1 ast_12 = asq_12.d();
        if (ast_12 == null) {
            f.warn((Object)("No image for news background " + this.l));
            return this.m;
        }
        File file = ast_12.a();
        try {
            URL uRL = file.toURI().toURL();
            BufferedImage bufferedImage = ImageIO.read(uRL);
            ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(uRL.toString()), azk_2.a(bufferedImage), true);
            fqv fqv2 = new fqv();
            fqv2.onCheckOut();
            fqv2.setTexture(ays_22);
            fsk_0 fsk_02 = new fsk_0();
            fsk_02.onCheckOut();
            fsk_02.setNonBlocking(true);
            fsk_02.setExpandable(false);
            fsk_02.add(fqv2);
            fsk_02.onChildrenAdded();
            fsk_02.a();
            fsk_02.setSizeToPrefSize();
            this.m.add(fsk_02);
            this.m.onChildrenAdded();
        }
        catch (MalformedURLException malformedURLException) {
            f.warn((Object)("URL error for \"" + file + "\""), (Throwable)malformedURLException);
        }
        catch (IOException iOException) {
            f.warn((Object)("Read error for \"" + file + "\""), (Throwable)iOException);
        }
        return this.m;
    }

    public void g() {
        if (this.m != null) {
            this.m.destroySelfFromParent();
        }
    }
}

