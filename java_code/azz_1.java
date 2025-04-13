/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Preconditions;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from azz
 */
public class azz_1
implements gn_0 {
    private final azk_1 a;
    private final String b;
    private boolean c;
    private boolean d;
    @Nullable
    private azk_2 e;

    public azz_1(azk_1 azk_12, String string) {
        this.a = azk_12;
        this.b = string;
        this.c = false;
        this.d = false;
    }

    @Override
    public void a() {
        Preconditions.checkState((!this.c ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        Preconditions.checkState((!this.d ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        this.e = this.a.b(this.b);
        if (this.e != null) {
            this.c = true;
            return;
        }
        this.d = true;
    }

    @Override
    public void c() {
        this.d = true;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final azk_2 f() {
        return this.e;
    }

    public String toString() {
        return this.b == null ? "null" : this.b + " ready=" + this.c;
    }
}

