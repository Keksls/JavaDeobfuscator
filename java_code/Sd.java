/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class Sd {
    private final int a;
    private final ArrayList<Se> b = new ArrayList();
    @Nullable
    private String c;
    @Nullable
    private String d;

    public Sd(int n) {
        this.a = n;
    }

    public void a(Se se) {
        if (!this.b.contains(se)) {
            this.b.add(se);
        }
    }

    public <Choice extends Se> Choice a(int n) {
        for (int k = 0; k < this.b.size(); ++k) {
            Se se = this.b.get(k);
            if (se.b() != n) continue;
            return (Choice)se;
        }
        return null;
    }

    public int a() {
        return this.b.size();
    }

    public Iterator<Se> b() {
        return this.b.iterator();
    }

    public int c() {
        return this.a;
    }

    public Optional<String> d() {
        return Optional.ofNullable(this.c);
    }

    public void a(@Nullable String string) {
        this.c = string;
    }

    public Optional<String> e() {
        return Optional.ofNullable(this.d);
    }

    public void b(@Nullable String string) {
        this.d = string;
    }
}

