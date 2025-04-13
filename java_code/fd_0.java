/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Fd
 */
public final class fd_0 {
    private final fp_0 a;

    public fd_0(fp_0 fp_02) {
        this.a = fp_02;
    }

    public void a(gh_0 gh_02) {
        Object[] objectArray;
        gh_02.a(this.a.r());
        if (this.a.g()) {
            gh_02.a(this.a.e());
        }
        if (this.a.i()) {
            gh_02.a(this.a.f());
        }
        if (this.a.h()) {
            objectArray = this.a.c();
            gh_02.a((short)objectArray.length);
            for (Object object : objectArray) {
                gh_02.a((String)object);
            }
        }
        if (this.a.j()) {
            objectArray = this.a.s();
            gh_02.a((byte)objectArray.length);
            for (Object object : objectArray) {
                gh_02.a(((FS)object).a);
                gh_02.a(((FS)object).b);
            }
        }
        if (this.a.m()) {
            objectArray = this.a.q();
            gh_02.a((byte)objectArray.length);
            for (Object object : objectArray) {
                gh_02.a(((FR)object).a);
                gh_02.a(((FR)object).b);
            }
        }
        if (this.a.n()) {
            new fc_0(this.a.u()).a(gh_02);
        }
        if ((objectArray = this.a.b()) == null) {
            gh_02.a((short)0);
        } else {
            gh_02.a((short)objectArray.length);
            for (Object object : objectArray) {
                new fb_0((fo_0)object).a(gh_02);
            }
        }
    }
}

