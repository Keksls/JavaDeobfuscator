/*
 * Decompiled with CFR 0.152.
 */
public class ahr
implements ahl {
    private Object a;
    private Object b;
    private final String c;

    public ahr(String string) {
        this.c = string;
    }

    @Override
    public void a() {
        System.out.println(this.c + ": user " + this.b.toString() + " is using a" + this.a.toString());
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public void a(Object object) {
        this.a = object;
    }

    @Override
    public void b(Object object) {
        this.b = object;
    }
}

