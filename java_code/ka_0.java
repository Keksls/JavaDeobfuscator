/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ka
 */
public final class ka_0
extends GeneratedMessageV3.Builder<ka_0>
implements kb_0 {
    private int a;
    private long b;
    private int c;
    private long d;
    private Object e = "";
    private Object f = "";
    private Object g = "";
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private List<kc_0> m = Collections.emptyList();
    private RepeatedFieldBuilderV3<kc_0, ke_0, kf_0> n;
    private List<ju_0> o = Collections.emptyList();
    private RepeatedFieldBuilderV3<ju_0, jw_0, jx_0> p;
    private List<jq_0> q = Collections.emptyList();
    private RepeatedFieldBuilderV3<jq_0, js_0, jt_0> r;

    public static final Descriptors.Descriptor a() {
        return jo_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.b.ensureFieldAccessorsInitialized(jy_0.class, ka_0.class);
    }

    ka_0() {
        this.ai();
    }

    ka_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.ai();
    }

    private void ai() {
        if (jy_0.P()) {
            this.ak();
            this.am();
            this.ao();
        }
    }

    public ka_0 J() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        this.e = "";
        this.a &= 0xFFFFFFF7;
        this.f = "";
        this.a &= 0xFFFFFFEF;
        this.g = "";
        this.a &= 0xFFFFFFDF;
        this.h = 0;
        this.a &= 0xFFFFFFBF;
        this.i = 0;
        this.a &= 0xFFFFFF7F;
        this.j = 0;
        this.a &= 0xFFFFFEFF;
        this.k = 0;
        this.a &= 0xFFFFFDFF;
        this.l = 0;
        this.a &= 0xFFFFFBFF;
        if (this.n == null) {
            this.m = Collections.emptyList();
            this.a &= 0xFFFFF7FF;
        } else {
            this.n.clear();
        }
        if (this.p == null) {
            this.o = Collections.emptyList();
            this.a &= 0xFFFFEFFF;
        } else {
            this.p.clear();
        }
        if (this.r == null) {
            this.q = Collections.emptyList();
            this.a &= 0xFFFFDFFF;
        } else {
            this.r.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jo_0.a;
    }

    public jy_0 K() {
        return jy_0.M();
    }

    public jy_0 L() {
        jy_0 jy_02 = this.M();
        if (!jy_02.isInitialized()) {
            throw ka_0.newUninitializedMessageException((Message)jy_02);
        }
        return jy_02;
    }

    public jy_0 M() {
        jy_0 jy_02 = new jy_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        jy_02.r = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        jy_02.s = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        jy_02.t = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        jy_02.u = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        jy_02.v = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        jy_02.w = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        jy_02.x = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        jy_02.y = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        jy_02.z = this.j;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        jy_02.A = this.k;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        jy_02.B = this.l;
        if (this.n == null) {
            if ((this.a & 0x800) == 2048) {
                this.m = Collections.unmodifiableList(this.m);
                this.a &= 0xFFFFF7FF;
            }
            jy_02.C = this.m;
        } else {
            jy_02.C = this.n.build();
        }
        if (this.p == null) {
            if ((this.a & 0x1000) == 4096) {
                this.o = Collections.unmodifiableList(this.o);
                this.a &= 0xFFFFEFFF;
            }
            jy_02.D = this.o;
        } else {
            jy_02.D = this.p.build();
        }
        if (this.r == null) {
            if ((this.a & 0x2000) == 8192) {
                this.q = Collections.unmodifiableList(this.q);
                this.a &= 0xFFFFDFFF;
            }
            jy_02.E = this.q;
        } else {
            jy_02.E = this.r.build();
        }
        jy_02.q = n2;
        this.onBuilt();
        return jy_02;
    }

    public ka_0 N() {
        return (ka_0)super.clone();
    }

    public ka_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ka_0)super.setField(fieldDescriptor, object);
    }

    public ka_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ka_0)super.clearField(fieldDescriptor);
    }

    public ka_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ka_0)super.clearOneof(oneofDescriptor);
    }

    public ka_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ka_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ka_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ka_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ka_0 a(Message message) {
        if (message instanceof jy_0) {
            return this.a((jy_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ka_0 a(jy_0 jy_02) {
        if (jy_02 == jy_0.M()) {
            return this;
        }
        if (jy_02.b()) {
            this.a(jy_02.c());
        }
        if (jy_02.d()) {
            this.g(jy_02.e());
        }
        if (jy_02.f()) {
            this.b(jy_02.g());
        }
        if (jy_02.h()) {
            this.a |= 8;
            this.e = jy_02.u;
            this.onChanged();
        }
        if (jy_02.k()) {
            this.a |= 0x10;
            this.f = jy_02.v;
            this.onChanged();
        }
        if (jy_02.n()) {
            this.a |= 0x20;
            this.g = jy_02.w;
            this.onChanged();
        }
        if (jy_02.q()) {
            this.h(jy_02.r());
        }
        if (jy_02.s()) {
            this.i(jy_02.t());
        }
        if (jy_02.u()) {
            this.j(jy_02.v());
        }
        if (jy_02.w()) {
            this.k(jy_02.x());
        }
        if (jy_02.y()) {
            this.l(jy_02.z());
        }
        if (this.n == null) {
            if (!jy_02.C.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = jy_02.C;
                    this.a &= 0xFFFFF7FF;
                } else {
                    this.aj();
                    this.m.addAll(jy_02.C);
                }
                this.onChanged();
            }
        } else if (!jy_02.C.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n.dispose();
                this.n = null;
                this.m = jy_02.C;
                this.a &= 0xFFFFF7FF;
                this.n = jy_0.Q() ? this.ak() : null;
            } else {
                this.n.addAllMessages(jy_02.C);
            }
        }
        if (this.p == null) {
            if (!jy_02.D.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = jy_02.D;
                    this.a &= 0xFFFFEFFF;
                } else {
                    this.al();
                    this.o.addAll(jy_02.D);
                }
                this.onChanged();
            }
        } else if (!jy_02.D.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p.dispose();
                this.p = null;
                this.o = jy_02.D;
                this.a &= 0xFFFFEFFF;
                this.p = jy_0.R() ? this.am() : null;
            } else {
                this.p.addAllMessages(jy_02.D);
            }
        }
        if (this.r == null) {
            if (!jy_02.E.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = jy_02.E;
                    this.a &= 0xFFFFDFFF;
                } else {
                    this.an();
                    this.q.addAll(jy_02.E);
                }
                this.onChanged();
            }
        } else if (!jy_02.E.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r.dispose();
                this.r = null;
                this.q = jy_02.E;
                this.a &= 0xFFFFDFFF;
                this.r = jy_0.S() ? this.ao() : null;
            } else {
                this.r.addAllMessages(jy_02.E);
            }
        }
        this.b(jy_0.b(jy_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (!this.h()) {
            return false;
        }
        if (!this.k()) {
            return false;
        }
        if (!this.n()) {
            return false;
        }
        if (!this.q()) {
            return false;
        }
        if (!this.s()) {
            return false;
        }
        if (!this.u()) {
            return false;
        }
        if (!this.w()) {
            return false;
        }
        if (!this.y()) {
            return false;
        }
        for (n = 0; n < this.C(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.F(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.I(); ++n) {
            if (this.e(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ka_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jy_0 jy_02 = null;
        try {
            jy_02 = (jy_0)jy_0.o.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jy_02 = (jy_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jy_02 != null) {
                this.a(jy_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public ka_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public ka_0 O() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public ka_0 g(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public ka_0 P() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public long g() {
        return this.d;
    }

    public ka_0 b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public ka_0 Q() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public String i() {
        Object object = this.e;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.e = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString j() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ka_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = string;
        this.onChanged();
        return this;
    }

    public ka_0 R() {
        this.a &= 0xFFFFFFF7;
        this.e = jy_0.M().i();
        this.onChanged();
        return this;
    }

    public ka_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public String l() {
        Object object = this.f;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString m() {
        Object object = this.f;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.f = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ka_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.f = string;
        this.onChanged();
        return this;
    }

    public ka_0 S() {
        this.a &= 0xFFFFFFEF;
        this.f = jy_0.M().l();
        this.onChanged();
        return this;
    }

    public ka_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.f = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public String o() {
        Object object = this.g;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.g = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString p() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ka_0 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.g = string;
        this.onChanged();
        return this;
    }

    public ka_0 T() {
        this.a &= 0xFFFFFFDF;
        this.g = jy_0.M().o();
        this.onChanged();
        return this;
    }

    public ka_0 c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.g = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean q() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int r() {
        return this.h;
    }

    public ka_0 h(int n) {
        this.a |= 0x40;
        this.h = n;
        this.onChanged();
        return this;
    }

    public ka_0 U() {
        this.a &= 0xFFFFFFBF;
        this.h = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean s() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int t() {
        return this.i;
    }

    public ka_0 i(int n) {
        this.a |= 0x80;
        this.i = n;
        this.onChanged();
        return this;
    }

    public ka_0 V() {
        this.a &= 0xFFFFFF7F;
        this.i = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public int v() {
        return this.j;
    }

    public ka_0 j(int n) {
        this.a |= 0x100;
        this.j = n;
        this.onChanged();
        return this;
    }

    public ka_0 W() {
        this.a &= 0xFFFFFEFF;
        this.j = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean w() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public int x() {
        return this.k;
    }

    public ka_0 k(int n) {
        this.a |= 0x200;
        this.k = n;
        this.onChanged();
        return this;
    }

    public ka_0 X() {
        this.a &= 0xFFFFFDFF;
        this.k = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean y() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int z() {
        return this.l;
    }

    public ka_0 l(int n) {
        this.a |= 0x400;
        this.l = n;
        this.onChanged();
        return this;
    }

    public ka_0 Y() {
        this.a &= 0xFFFFFBFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    private void aj() {
        if ((this.a & 0x800) != 2048) {
            this.m = new ArrayList<kc_0>(this.m);
            this.a |= 0x800;
        }
    }

    @Override
    public List<kc_0> A() {
        if (this.n == null) {
            return Collections.unmodifiableList(this.m);
        }
        return this.n.getMessageList();
    }

    @Override
    public int C() {
        if (this.n == null) {
            return this.m.size();
        }
        return this.n.getCount();
    }

    @Override
    public kc_0 a(int n) {
        if (this.n == null) {
            return this.m.get(n);
        }
        return (kc_0)this.n.getMessage(n);
    }

    public ka_0 a(int n, kc_0 kc_02) {
        if (this.n == null) {
            if (kc_02 == null) {
                throw new NullPointerException();
            }
            this.aj();
            this.m.set(n, kc_02);
            this.onChanged();
        } else {
            this.n.setMessage(n, (AbstractMessage)kc_02);
        }
        return this;
    }

    public ka_0 a(int n, ke_0 ke_02) {
        if (this.n == null) {
            this.aj();
            this.m.set(n, ke_02.m());
            this.onChanged();
        } else {
            this.n.setMessage(n, (AbstractMessage)ke_02.m());
        }
        return this;
    }

    public ka_0 a(kc_0 kc_02) {
        if (this.n == null) {
            if (kc_02 == null) {
                throw new NullPointerException();
            }
            this.aj();
            this.m.add(kc_02);
            this.onChanged();
        } else {
            this.n.addMessage((AbstractMessage)kc_02);
        }
        return this;
    }

    public ka_0 b(int n, kc_0 kc_02) {
        if (this.n == null) {
            if (kc_02 == null) {
                throw new NullPointerException();
            }
            this.aj();
            this.m.add(n, kc_02);
            this.onChanged();
        } else {
            this.n.addMessage(n, (AbstractMessage)kc_02);
        }
        return this;
    }

    public ka_0 a(ke_0 ke_02) {
        if (this.n == null) {
            this.aj();
            this.m.add(ke_02.m());
            this.onChanged();
        } else {
            this.n.addMessage((AbstractMessage)ke_02.m());
        }
        return this;
    }

    public ka_0 b(int n, ke_0 ke_02) {
        if (this.n == null) {
            this.aj();
            this.m.add(n, ke_02.m());
            this.onChanged();
        } else {
            this.n.addMessage(n, (AbstractMessage)ke_02.m());
        }
        return this;
    }

    public ka_0 a(Iterable<? extends kc_0> iterable) {
        if (this.n == null) {
            this.aj();
            AbstractMessageLite.Builder.addAll(iterable, this.m);
            this.onChanged();
        } else {
            this.n.addAllMessages(iterable);
        }
        return this;
    }

    public ka_0 Z() {
        if (this.n == null) {
            this.m = Collections.emptyList();
            this.a &= 0xFFFFF7FF;
            this.onChanged();
        } else {
            this.n.clear();
        }
        return this;
    }

    public ka_0 m(int n) {
        if (this.n == null) {
            this.aj();
            this.m.remove(n);
            this.onChanged();
        } else {
            this.n.remove(n);
        }
        return this;
    }

    public ke_0 n(int n) {
        return (ke_0)this.ak().getBuilder(n);
    }

    @Override
    public kf_0 b(int n) {
        if (this.n == null) {
            return this.m.get(n);
        }
        return (kf_0)this.n.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kf_0> B() {
        if (this.n != null) {
            return this.n.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.m);
    }

    public ke_0 aa() {
        return (ke_0)this.ak().addBuilder((AbstractMessage)kc_0.n());
    }

    public ke_0 o(int n) {
        return (ke_0)this.ak().addBuilder(n, (AbstractMessage)kc_0.n());
    }

    public List<ke_0> ab() {
        return this.ak().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kc_0, ke_0, kf_0> ak() {
        if (this.n == null) {
            this.n = new RepeatedFieldBuilderV3(this.m, (this.a & 0x800) == 2048, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.m = null;
        }
        return this.n;
    }

    private void al() {
        if ((this.a & 0x1000) != 4096) {
            this.o = new ArrayList<ju_0>(this.o);
            this.a |= 0x1000;
        }
    }

    @Override
    public List<ju_0> D() {
        if (this.p == null) {
            return Collections.unmodifiableList(this.o);
        }
        return this.p.getMessageList();
    }

    @Override
    public int F() {
        if (this.p == null) {
            return this.o.size();
        }
        return this.p.getCount();
    }

    @Override
    public ju_0 c(int n) {
        if (this.p == null) {
            return this.o.get(n);
        }
        return (ju_0)this.p.getMessage(n);
    }

    public ka_0 a(int n, ju_0 ju_02) {
        if (this.p == null) {
            if (ju_02 == null) {
                throw new NullPointerException();
            }
            this.al();
            this.o.set(n, ju_02);
            this.onChanged();
        } else {
            this.p.setMessage(n, (AbstractMessage)ju_02);
        }
        return this;
    }

    public ka_0 a(int n, jw_0 jw_02) {
        if (this.p == null) {
            this.al();
            this.o.set(n, jw_02.G());
            this.onChanged();
        } else {
            this.p.setMessage(n, (AbstractMessage)jw_02.G());
        }
        return this;
    }

    public ka_0 a(ju_0 ju_02) {
        if (this.p == null) {
            if (ju_02 == null) {
                throw new NullPointerException();
            }
            this.al();
            this.o.add(ju_02);
            this.onChanged();
        } else {
            this.p.addMessage((AbstractMessage)ju_02);
        }
        return this;
    }

    public ka_0 b(int n, ju_0 ju_02) {
        if (this.p == null) {
            if (ju_02 == null) {
                throw new NullPointerException();
            }
            this.al();
            this.o.add(n, ju_02);
            this.onChanged();
        } else {
            this.p.addMessage(n, (AbstractMessage)ju_02);
        }
        return this;
    }

    public ka_0 a(jw_0 jw_02) {
        if (this.p == null) {
            this.al();
            this.o.add(jw_02.G());
            this.onChanged();
        } else {
            this.p.addMessage((AbstractMessage)jw_02.G());
        }
        return this;
    }

    public ka_0 b(int n, jw_0 jw_02) {
        if (this.p == null) {
            this.al();
            this.o.add(n, jw_02.G());
            this.onChanged();
        } else {
            this.p.addMessage(n, (AbstractMessage)jw_02.G());
        }
        return this;
    }

    public ka_0 b(Iterable<? extends ju_0> iterable) {
        if (this.p == null) {
            this.al();
            AbstractMessageLite.Builder.addAll(iterable, this.o);
            this.onChanged();
        } else {
            this.p.addAllMessages(iterable);
        }
        return this;
    }

    public ka_0 ac() {
        if (this.p == null) {
            this.o = Collections.emptyList();
            this.a &= 0xFFFFEFFF;
            this.onChanged();
        } else {
            this.p.clear();
        }
        return this;
    }

    public ka_0 p(int n) {
        if (this.p == null) {
            this.al();
            this.o.remove(n);
            this.onChanged();
        } else {
            this.p.remove(n);
        }
        return this;
    }

    public jw_0 q(int n) {
        return (jw_0)this.am().getBuilder(n);
    }

    @Override
    public jx_0 d(int n) {
        if (this.p == null) {
            return this.o.get(n);
        }
        return (jx_0)this.p.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jx_0> E() {
        if (this.p != null) {
            return this.p.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.o);
    }

    public jw_0 ad() {
        return (jw_0)this.am().addBuilder((AbstractMessage)ju_0.H());
    }

    public jw_0 r(int n) {
        return (jw_0)this.am().addBuilder(n, (AbstractMessage)ju_0.H());
    }

    public List<jw_0> ae() {
        return this.am().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ju_0, jw_0, jx_0> am() {
        if (this.p == null) {
            this.p = new RepeatedFieldBuilderV3(this.o, (this.a & 0x1000) == 4096, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.o = null;
        }
        return this.p;
    }

    private void an() {
        if ((this.a & 0x2000) != 8192) {
            this.q = new ArrayList<jq_0>(this.q);
            this.a |= 0x2000;
        }
    }

    @Override
    public List<jq_0> G() {
        if (this.r == null) {
            return Collections.unmodifiableList(this.q);
        }
        return this.r.getMessageList();
    }

    @Override
    public int I() {
        if (this.r == null) {
            return this.q.size();
        }
        return this.r.getCount();
    }

    @Override
    public jq_0 e(int n) {
        if (this.r == null) {
            return this.q.get(n);
        }
        return (jq_0)this.r.getMessage(n);
    }

    public ka_0 a(int n, jq_0 jq_02) {
        if (this.r == null) {
            if (jq_02 == null) {
                throw new NullPointerException();
            }
            this.an();
            this.q.set(n, jq_02);
            this.onChanged();
        } else {
            this.r.setMessage(n, (AbstractMessage)jq_02);
        }
        return this;
    }

    public ka_0 a(int n, js_0 js_02) {
        if (this.r == null) {
            this.an();
            this.q.set(n, js_02.j());
            this.onChanged();
        } else {
            this.r.setMessage(n, (AbstractMessage)js_02.j());
        }
        return this;
    }

    public ka_0 a(jq_0 jq_02) {
        if (this.r == null) {
            if (jq_02 == null) {
                throw new NullPointerException();
            }
            this.an();
            this.q.add(jq_02);
            this.onChanged();
        } else {
            this.r.addMessage((AbstractMessage)jq_02);
        }
        return this;
    }

    public ka_0 b(int n, jq_0 jq_02) {
        if (this.r == null) {
            if (jq_02 == null) {
                throw new NullPointerException();
            }
            this.an();
            this.q.add(n, jq_02);
            this.onChanged();
        } else {
            this.r.addMessage(n, (AbstractMessage)jq_02);
        }
        return this;
    }

    public ka_0 a(js_0 js_02) {
        if (this.r == null) {
            this.an();
            this.q.add(js_02.j());
            this.onChanged();
        } else {
            this.r.addMessage((AbstractMessage)js_02.j());
        }
        return this;
    }

    public ka_0 b(int n, js_0 js_02) {
        if (this.r == null) {
            this.an();
            this.q.add(n, js_02.j());
            this.onChanged();
        } else {
            this.r.addMessage(n, (AbstractMessage)js_02.j());
        }
        return this;
    }

    public ka_0 c(Iterable<? extends jq_0> iterable) {
        if (this.r == null) {
            this.an();
            AbstractMessageLite.Builder.addAll(iterable, this.q);
            this.onChanged();
        } else {
            this.r.addAllMessages(iterable);
        }
        return this;
    }

    public ka_0 af() {
        if (this.r == null) {
            this.q = Collections.emptyList();
            this.a &= 0xFFFFDFFF;
            this.onChanged();
        } else {
            this.r.clear();
        }
        return this;
    }

    public ka_0 s(int n) {
        if (this.r == null) {
            this.an();
            this.q.remove(n);
            this.onChanged();
        } else {
            this.r.remove(n);
        }
        return this;
    }

    public js_0 t(int n) {
        return (js_0)this.ao().getBuilder(n);
    }

    @Override
    public jt_0 f(int n) {
        if (this.r == null) {
            return this.q.get(n);
        }
        return (jt_0)this.r.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jt_0> H() {
        if (this.r != null) {
            return this.r.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.q);
    }

    public js_0 ag() {
        return (js_0)this.ao().addBuilder((AbstractMessage)jq_0.k());
    }

    public js_0 u(int n) {
        return (js_0)this.ao().addBuilder(n, (AbstractMessage)jq_0.k());
    }

    public List<js_0> ah() {
        return this.ao().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jq_0, js_0, jt_0> ao() {
        if (this.r == null) {
            this.r = new RepeatedFieldBuilderV3(this.q, (this.a & 0x2000) == 8192, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.q = null;
        }
        return this.r;
    }

    public final ka_0 a(UnknownFieldSet unknownFieldSet) {
        return (ka_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ka_0 b(UnknownFieldSet unknownFieldSet) {
        return (ka_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.J();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.N();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.J();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.N();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.N();
    }

    public /* synthetic */ Message buildPartial() {
        return this.M();
    }

    public /* synthetic */ Message build() {
        return this.L();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.J();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.N();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.M();
    }

    public /* synthetic */ MessageLite build() {
        return this.L();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.J();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.K();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.K();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.N();
    }

    public /* synthetic */ Object clone() {
        return this.N();
    }
}

