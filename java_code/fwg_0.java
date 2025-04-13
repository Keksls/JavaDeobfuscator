/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from fwG
 */
public class fwg_0 {
    public final fjg_1 a;
    public final EntitySprite b;
    public final EntitySprite c;
    private byte d = 0;

    public fwg_0(fjg_1 fjg_12, EntitySprite entitySprite, EntitySprite entitySprite2) {
        this.a = fjg_12;
        this.b = entitySprite;
        this.c = entitySprite2;
    }

    public Object a() {
        return this.a.j();
    }

    public void b() {
        this.b.k_();
        this.c.k_();
        this.d = (byte)(this.d + 1);
    }

    public void c() {
        if (this.d > 0) {
            this.b.u();
            this.c.u();
        }
        this.d = (byte)(this.d - 1);
    }
}

