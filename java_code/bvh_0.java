/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bVH
 */
public class bvh_0
extends bva_0 {
    private static final Logger m = Logger.getLogger(bvh_0.class);
    public static final String b = "videoPlaying";
    public static final String d = "videoMuted";
    public static final String e = "videoSoundVolumeValue";
    public static final String f = "videoSoundVolumeText";
    public static final String g = "videoProgressionValue";
    public static final String h = "videoCurrentTimeText";
    public static final String i = "videoTotalTimeText";
    public static final String j = "availableQualities";
    public static final String k = "selectedQuality";
    public static final String[] l = new String[]{"videoPlaying", "videoMuted", "videoSoundVolumeValue", "videoSoundVolumeText", "videoProgressionValue", "videoCurrentTimeText", "videoTotalTimeText", "availableQualities", "selectedQuality"};
    private fvp n;
    float o;
    private final ArrayList<bvm_0> p = new ArrayList();
    private final fzu q = new bvi_0(this);
    private bvm_0 r;
    private fsk_0 s;

    public bvh_0(asp_1 asp_12) {
        super(asp_12);
        int[] nArray = ((atf_1)asp_12).i();
        for (int k = 0; k < nArray.length; ++k) {
            this.p.add(new bvm_0(nArray[k]));
        }
        this.p.sort(new bvj_0(this));
        this.r = this.p.get(this.p.size() - 1);
    }

    @Override
    public String[] d() {
        return l;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(g)) {
            if (!this.n.isInitialized()) {
                return Float.valueOf(0.0f);
            }
            return Float.valueOf(this.o / (float)this.n.getVideoDuration());
        }
        if (string.equals(h)) {
            if (!this.n.isInitialized()) {
                return bvh_0.b(0L);
            }
            return bvh_0.b((long)this.o);
        }
        if (string.equals(i)) {
            if (!this.n.isInitialized()) {
                return bvh_0.b(0L);
            }
            return bvh_0.b(this.n.getVideoDuration());
        }
        if (string.equals(e)) {
            return Float.valueOf(this.n.getVolume());
        }
        if (string.equals(f)) {
            return (int)(this.n.getVolume() / 1.0f * 100.0f) + "%";
        }
        if (string.equals(d)) {
            return this.g();
        }
        if (string.equals(j)) {
            return this.p;
        }
        if (string.equals(k)) {
            return this.r;
        }
        return null;
    }

    public boolean e() {
        return this.n.isInitialized() && !this.n.isPaused();
    }

    public static String b(long l) {
        long l2 = (l /= 1000L) / 60L;
        long l3 = l - 60L * l2;
        return String.format("%d:%s", l2, l3 > 9L ? Long.valueOf(l3) : "0" + l3);
    }

    @Override
    public void b() {
        if (!this.n.isInitialized()) {
            if (this.s != null) {
                this.s.setVisible(false);
            }
            this.h();
            this.n.a(new bvk_0(this));
            return;
        }
        this.n.setPaused(!this.n.isPaused());
    }

    @Override
    public fso a(fso fso2, bVw bVw2) {
        fso fso3 = super.a(fso2, bVw2);
        atf_1 atf_12 = (atf_1)this.a;
        this.a(fso3, atf_12);
        ast_1 ast_12 = atf_12.g();
        if (ast_12 != null) {
            try {
                URL uRL = ast_12.a().toURL();
                ayo_2 ayo_22 = new ayo_2(fdo_2.b().a(uRL));
                fqv fqv2 = new fqv();
                fqv2.onCheckOut();
                fqv2.setPixmap(ayo_22);
                this.s = new fsk_0();
                this.s.onCheckOut();
                this.s.setNonBlocking(true);
                this.s.setExpandable(false);
                this.s.add(fqv2);
                this.s.onChildrenAdded();
                this.s.a();
                this.s.setSizeToPrefSize();
                fid_1 fid_12 = new fid_1();
                fid_12.onCheckOut();
                fid_12.setSize(new fjf_2(100.0f, 100.0f));
                fid_12.setAlign(frk_0.i);
                this.s.setLayoutData(fid_12);
                fso3.add(this.s);
                fso3.onChildrenAdded();
            }
            catch (MalformedURLException malformedURLException) {
                m.warn((Object)("URL malform\u00e9e : \"" + ast_12.a() + "\""));
            }
        }
        fso3.onChildrenAdded();
        return fso3;
    }

    private void a(fso fso2, atf_1 atf_12) {
        if (this.n != null) {
            this.n.destroySelfFromParent();
        }
        this.n = fvp.checkOut();
        this.n.setKeepRatio(false);
        URL uRL = atf_12.a(this.r.a());
        if (!cd_0.a(uRL)) {
            m.error((Object)("Impossible de retrouver la vid\u00e9o dans cette qualit\u00e9 " + this.r));
            return;
        }
        this.n.setVideoPath(uRL.toExternalForm());
        fso2.add(this.n);
        fso2.onChildrenAdded();
        this.n.setPrefSize(new fjf_2(atf_12.a().e(), atf_12.a().f()));
        this.n.addEventListener(frd_0.L, this.q, false);
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(atf_12.a().e(), atf_12.a().f()));
        fid_12.setAlign(frk_0.i);
        this.n.setLayoutData(fid_12);
    }

    public fvp f() {
        return this.n;
    }

    @Override
    public void c() {
        super.c();
    }

    public void a(float f2) {
        this.n.setVolume(f2);
    }

    public void b(float f2) {
        this.n.a(f2);
    }

    public void a(fso fso2, int n) {
        boolean bl = this.e();
        for (bvm_0 bvm_02 : this.p) {
            if (bvm_02.a() != n) continue;
            this.r = bvm_02;
        }
        this.a(fso2, (atf_1)this.a);
        if (bl) {
            this.h();
        }
    }

    private void h() {
        this.n.a();
    }

    public boolean g() {
        return this.n.isMuted();
    }

    public void a(boolean bl) {
        this.n.b(bl);
    }
}

