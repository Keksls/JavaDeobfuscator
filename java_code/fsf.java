/*
 * Decompiled with CFR 0.152.
 */
public class fsf
extends fig_2 {
    final /* synthetic */ fsb a;

    public fsf(fsb fsb2) {
        this.a = fsb2;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = this.a.q.width * this.a.o + this.a.n * (this.a.o - 1);
        int n2 = this.a.q.height * this.a.p + this.a.m * (this.a.p - 1);
        return new fjf_2(n, n2);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return this.getContentMinSize(fso2);
    }

    @Override
    public void a(fso fso2) {
        int n;
        if (this.a.j == null) {
            return;
        }
        int n2 = 0;
        if (this.a.l != null) {
            n = this.a.l.get(5);
            this.a.l.set(5, 1);
            n2 = (this.a.l.get(7) - this.a.l.getFirstDayOfWeek() + 7) % 7;
            this.a.l.set(5, n);
        }
        n = n2;
        int n3 = this.a.p - 1;
        for (int k = 0; k < this.a.j.size(); ++k) {
            fso fso3 = this.a.j.get(k).b();
            int n4 = (this.a.q.width + this.a.n) * n;
            int n5 = (this.a.q.height + this.a.m) * n3;
            fso3.setPosition(n4, n5);
            fso3.setSize(this.a.q.width, this.a.q.height);
            if (++n != this.a.o) continue;
            n = 0;
            --n3;
        }
        this.a.setSelectedDate(this.a.w + 1);
    }
}

