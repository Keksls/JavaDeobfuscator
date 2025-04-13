/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

class def
implements TObjectProcedure<ese_1> {
    private int a;
    private int b;
    private int c;

    def() {
    }

    public boolean a(ese_1 ese_12) {
        this.a += ese_12.d();
        this.b += ese_12.e();
        ++this.c;
        return true;
    }

    @Nullable
    afe_1 a() {
        return this.c > 0 ? new afe_1(this.a / this.c, this.b / this.c) : null;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

