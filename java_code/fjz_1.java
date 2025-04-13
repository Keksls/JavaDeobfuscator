/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJZ
 */
public class fjz_1 {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final XulorParticleSystem f;

    public fjz_1(String string, int n, int n2, int n3, int n4) {
        this(string, n, n2, n3, n4, null);
    }

    public fjz_1(String string, int n, int n2, int n3, int n4, @Nullable XulorParticleSystem xulorParticleSystem) {
        this.a = string;
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = xulorParticleSystem;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    @Nullable
    public XulorParticleSystem f() {
        return this.f;
    }

    public void a(int n, int n2) {
    }

    public String g() {
        return fpm_0.b().c(this.a);
    }
}

