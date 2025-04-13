/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

class fuv
implements fzc {
    final /* synthetic */ fso a;
    final /* synthetic */ Consumer b;
    final /* synthetic */ fso c;
    final /* synthetic */ fut_0 d;

    fuv(fut_0 fut_02, fso fso2, Consumer consumer, fso fso3) {
        this.d = fut_02;
        this.a = fso2;
        this.b = consumer;
        this.c = fso3;
    }

    @Override
    public boolean a(int n) {
        if (this.a.isValid()) {
            this.a.removePostProcessCallback(this);
            this.b.accept(this.c);
            return false;
        }
        return true;
    }
}

