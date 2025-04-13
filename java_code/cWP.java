/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class cWP
extends Thread {
    public ArrayList<ays_2> a;
    private int e;
    private int f;
    final /* synthetic */ bks_1[] b;
    final /* synthetic */ anv_1 c;
    final /* synthetic */ cwk_0 d;

    cWP(cwk_0 cwk_02, bks_1[] bks_1Array, anv_1 anv_12) {
        this.d = cwk_02;
        this.b = bks_1Array;
        this.c = anv_12;
    }

    private void a(bks_1 bks_12, String string) {
        ays_2 ays_22 = fdo_2.b().a((String)bks_12.b(string));
        if (ays_22 != null) {
            ays_22.k_();
            this.a.add(ays_22);
            this.d.E.add(ays_22);
        }
    }

    @Override
    public void run() {
        this.a = new ArrayList();
        for (bks_1 bks_12 : this.b) {
            this.a(bks_12, "maleIllustration");
            this.a(bks_12, "femaleIllustration");
        }
        while (true) {
            if (this.a.isEmpty() || this.f >= 5000) {
                cwk_0.c.info((Object)"Creation dialog loading finish");
                this.a.clear();
                cuo_0.e().b();
                return;
            }
            for (int k = this.a.size() - 1; k >= 0; --k) {
                ays_2 ays_22 = this.a.get(k);
                if (ays_22 == null) {
                    this.c.a(this.e++);
                    this.a.remove(k);
                    continue;
                }
                if (!ays_22.j()) continue;
                this.c.a(this.e++);
                this.a.remove(ays_22);
            }
            try {
                Thread.sleep(50L);
                this.f += 50;
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                continue;
            }
            break;
        }
    }
}

