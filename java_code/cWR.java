/*
 * Decompiled with CFR 0.152.
 */
class cWR {
    private static final float b = 0.3f;
    private static final int c = 10;
    private static final int d = 20;
    private final aej_2[] e = aej_2.d();
    private int f;
    private float g;
    private int h;
    private final byte i;
    final /* synthetic */ cwk_0 a;

    cWR(cwk_0 cwk_02, byte by) {
        this.a = cwk_02;
        this.i = by;
        this.f = aej_2.c.a();
        cwk_02.x.setDirection(this.f);
    }

    void a() {
        ++this.h;
        if (this.h == 10) {
            this.a.a(cwk_0.c(), this.i);
        }
        if (this.h > 20) {
            this.a.s();
            this.f = aej_2.c.a();
            this.a.x.setDirection(this.f);
            this.a.x.setAnimName("AnimLevelUp");
            fis_1.a().a("characterCreation.editablePlayerInfo", "actorDescriptorLibrary");
            fis_1.a().a("characterCreation.editablePlayerInfo", "actorLinkage");
            return;
        }
        this.g += 0.3f;
        int n = Hw.c(Hw.f(this.g) * 100.0f);
        ado_1.a().a(() -> {
            if (this.f > this.e.length - 1) {
                this.f = 0;
            }
            this.a.x.setDirection(this.e[this.f].a());
            ++this.f;
            this.a();
        }, n, 1);
    }
}

