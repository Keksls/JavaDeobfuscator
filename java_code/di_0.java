/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from Di
 */
public class di_0 {
    private short a;
    private String b;
    private int c;
    private int d;
    private byte e;
    private boolean f;
    private int g = -1;
    private fs_0[] h;
    private fs_0 i;
    private boolean j;
    private int k = -1;

    public short a() {
        return this.a;
    }

    public void a(short s2) {
        this.a = s2;
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public int c() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public int d() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }

    public byte e() {
        return this.e;
    }

    public void a(byte by) {
        this.e = by;
    }

    public boolean f() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public int g() {
        return this.g;
    }

    public Set<Fz> c(int n) {
        HashSet hashSet = Sets.newHashSet();
        fs_0[] fs_0Array = this.h;
        if (n >= fs_0Array.length) {
            return hashSet;
        }
        Fz[] fzArray = fs_0Array[n].b();
        Collections.addAll(hashSet, fzArray);
        return hashSet;
    }

    public void d(int n) {
        this.g = n;
    }

    public fs_0[] h() {
        return this.h;
    }

    public void a(fs_0[] fs_0Array) {
        this.h = fs_0Array;
    }

    public fs_0 i() {
        return this.i;
    }

    public void a(fs_0 fs_02) {
        this.i = fs_02;
    }

    public boolean j() {
        return this.j;
    }

    public void b(boolean bl) {
        this.j = bl;
    }

    public int k() {
        return this.k;
    }

    public void e(int n) {
        this.k = n;
    }

    public void a(fy_0 fy_02) {
    }

    public int l() {
        return this.h.length;
    }
}

