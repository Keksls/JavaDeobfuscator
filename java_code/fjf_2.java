/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import org.apache.log4j.Logger;

/*
 * Renamed from fJF
 */
public class fjf_2
extends Dimension
implements Cloneable {
    private static Logger a = Logger.getLogger(fjf_2.class);
    private float b = -1.0f;
    private float c = -1.0f;

    public fjf_2() {
    }

    public fjf_2(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public fjf_2(fjf_2 fjf_22) {
        this.width = fjf_22.width;
        this.height = fjf_22.height;
        this.b = fjf_22.b;
        this.c = fjf_22.c;
    }

    public fjf_2(float f2, float f3) {
        this.b = f2;
        this.c = f3;
    }

    public fjf_2(int n, float f2) {
        this.width = n;
        this.c = f2;
    }

    public fjf_2(float f2, int n) {
        this.b = f2;
        this.height = n;
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }

    public void a(fjf_2 fjf_22) {
        this.width = Math.min(this.width, fjf_22.width);
        this.height = Math.min(this.height, fjf_22.height);
    }

    public void a(int n, int n2) {
        this.width = Math.min(this.width, n);
        this.height = Math.min(this.height, n2);
    }

    public void b(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public void a(float f2, float f3) {
        this.c = f3;
        this.b = f2;
    }

    public void a(int n) {
        this.height = n;
    }

    public void a(float f2) {
        this.c = f2;
    }

    public void b(int n) {
        this.width = n;
    }

    public void b(float f2) {
        this.b = f2;
    }

    public boolean c() {
        return this.b != -1.0f || this.c != -1.0f;
    }

    public boolean b(fjf_2 fjf_22) {
        if (fjf_22 == null) {
            return false;
        }
        if (fjf_22.height != this.height) {
            return false;
        }
        if (fjf_22.width != this.width) {
            return false;
        }
        if (fjf_22.c != this.c) {
            return false;
        }
        return fjf_22.b == this.b;
    }

    public fjf_2 d() {
        fjf_2 fjf_22 = new fjf_2(this.width, this.height);
        fjf_22.a(this.c);
        fjf_22.b(this.b);
        return fjf_22;
    }
}

