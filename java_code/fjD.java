/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class fjD {
    private final int a;
    private final int b;
    private final List<fjE> c = new ArrayList<fjE>();

    public fjD(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    @NotNull
    public List<fjE> c() {
        return this.c;
    }
}

