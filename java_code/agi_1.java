/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aGI
 */
public interface agi_1
extends abu_1,
adv_1 {
    default public void a(agf_1 agf_12, Exception exception) {
        Logger.getLogger(this.getClass()).error((Object)("Exception during request execution, request : " + agf_12), (Throwable)exception);
    }
}

