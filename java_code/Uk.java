/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class Uk
implements UF {
    protected static final Logger a = Logger.getLogger(Uk.class);
    protected final Ui b;
    protected final ul_0 c;

    public Uk(Ui ui, ul_0 ul_02) {
        this.b = ui;
        this.c = ul_02;
    }

    public Ui a() {
        return this.b;
    }

    public ul_0 b() {
        return this.c;
    }

    public String toString() {
        return "InventoryEvent{m_action=" + this.c + ", m_eventInventoryType=" + this.b + "}";
    }
}

