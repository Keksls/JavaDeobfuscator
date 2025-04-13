/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.kernel.core.common;

public class MemoryObjectPool$2
extends abi_1 {
    final /* synthetic */ Class a;

    public MemoryObjectPool$2(Class clazz, Class clazz2) {
        this.a = clazz2;
        super(clazz);
    }

    public abh_1 b() {
        try {
            return (abh_1)this.a.newInstance();
        }
        catch (InstantiationException instantiationException) {
            abj_1.b.error((Object)"", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException(this.a.toString(), illegalAccessException);
        }
        catch (ClassCastException classCastException) {
            throw new IllegalArgumentException(this.a + " n'est pas de type MemoryObject");
        }
        return null;
    }
}

