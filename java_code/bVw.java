/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bVw
implements ajh_1 {
    public static final String a = "currentNew";
    public static final String b = "list";
    public static final String d = "hasPreviousNew";
    public static final String e = "hasNextNew";
    public static final String f = "videoSoundVolumeValue";
    public static final String[] g = new String[]{"currentNew", "list", "hasPreviousNew", "hasNextNew", "videoSoundVolumeValue"};
    private final ArrayList<bvd_0> h = new ArrayList();
    private bvd_0 i;
    private final fzu j = new bVx(this);
    final ArrayList<bvf_0> k = new ArrayList();
    fso l = null;

    public bVw(asm_1 asm_12) {
        for (asv_1 asv_12 : asm_12.d()) {
            this.h.add(new bvd_0(asv_12));
        }
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.b();
        }
        if (string.equals(e)) {
            return this.a();
        }
        return null;
    }

    public boolean a() {
        return this.h.size() > 1 && this.i != this.h.get(this.h.size() - 1);
    }

    public boolean b() {
        return this.h.size() > 1 && this.i != this.h.get(0);
    }

    private void j() {
        this.i.g();
        this.k.clear();
        if (this.l != null) {
            this.l.destroySelfFromParent();
            this.l.removeAllEventListeners();
            this.l = null;
        }
        for (bva_0 bva_02 : this.i.b()) {
            bva_02.c();
        }
        for (bva_0 bva_02 : this.i.a()) {
            bva_02.c();
        }
    }

    public void a(fso fso2) {
        if (this.i == null) {
            return;
        }
        fso2.add(this.i.f());
        fso2.onChildrenAdded();
        fvE fvE2 = (fvE)fso2.getElementMap().a("bigPLayButton");
        fvE2.setVisible(false);
        for (bva_0 bva_02 : this.i.b()) {
            fso2.add(bva_02.a(fso2, this));
            fso2.onChildrenAdded();
            fvp fvp2 = ((bvh_0)bva_02).f();
            fvp2.addEventListener(frd_0.L, this.j, false);
            fvE2.setVisible(true);
        }
        for (bva_0 bva_02 : this.i.a()) {
            fso2.add(bva_02.a(fso2, this));
            fso2.onChildrenAdded();
        }
    }

    void a(long l) {
        for (bva_0 bva_02 : this.i.a()) {
            bva_02.a(l);
        }
    }

    void a(afk_2 afk_22, fso fso2, fso fso3) {
        Object object;
        if (this.l == null) {
            this.l = fso.checkOut();
            object = ((fid_1)fso3.getLayoutData()).getSize();
            fid_1 fid_12 = new fid_1();
            fid_12.onCheckOut();
            fid_12.setSize(new fjf_2((fjf_2)object));
            fid_12.setX(0);
            fid_12.setY(0);
            this.l.setLayoutData(fid_12);
            this.l.setNonBlocking(false);
            bVy bVy2 = new bVy(this, (fjf_2)object);
            this.l.addEventListener(frd_0.u, bVy2, false);
            this.l.addEventListener(frd_0.y, bVy2, false);
            this.l.addEventListener(frd_0.z, new bVz(this), false);
            fso3.add(this.l);
            fso3.onChildrenAdded();
        }
        fso2.setVisible(false);
        object = new bvf_0(afk_22, fso2);
        this.k.add((bvf_0)object);
    }

    public void a(bvd_0 bvd_02) {
        if (this.i != null) {
            this.j();
        }
        this.i = bvd_02;
    }

    public bvd_0 c() {
        return this.i;
    }

    public void e() {
        this.j();
        fis_1.a().a("news");
    }

    public bvd_0 f() {
        return this.h.get(0);
    }

    public bvd_0 g() {
        int n = this.h.indexOf(this.i) - 1;
        if (n < 0) {
            return null;
        }
        return this.h.get(n);
    }

    public bvd_0 h() {
        int n = this.h.indexOf(this.i) + 1;
        if (n > this.h.size() - 1) {
            return null;
        }
        return this.h.get(n);
    }

    public void i() {
        dhb dhb2 = new dhb(this.i);
        dhb2.a(true);
        add_2.b().a(dhb2);
    }
}

