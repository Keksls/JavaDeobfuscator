/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from jm
 */
public final class jm_0
extends GeneratedMessageV3.Builder<jm_0>
implements jn_0 {
    private int a;
    private long b;
    private long c;
    private int d;
    private int e;
    private jo f = null;
    private SingleFieldBuilderV3<jo, jq, jr> g;
    private jo h = null;
    private SingleFieldBuilderV3<jo, jq, jr> i;
    private long j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long q;

    public static final Descriptors.Descriptor a() {
        return iw_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.b.ensureFieldAccessorsInitialized(jk_0.class, jm_0.class);
    }

    jm_0() {
        this.aa();
    }

    jm_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.aa();
    }

    private void aa() {
        if (jk_0.L()) {
            this.ab();
            this.ac();
        }
    }

    public jm_0 F() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        if (this.g == null) {
            this.f = null;
        } else {
            this.g.clear();
        }
        this.a &= 0xFFFFFFEF;
        if (this.i == null) {
            this.h = null;
        } else {
            this.i.clear();
        }
        this.a &= 0xFFFFFFDF;
        this.j = 0L;
        this.a &= 0xFFFFFFBF;
        this.k = 0;
        this.a &= 0xFFFFFF7F;
        this.l = 0;
        this.a &= 0xFFFFFEFF;
        this.m = 0;
        this.a &= 0xFFFFFDFF;
        this.n = 0;
        this.a &= 0xFFFFFBFF;
        this.o = 0;
        this.a &= 0xFFFFF7FF;
        this.p = 0;
        this.a &= 0xFFFFEFFF;
        this.q = 0L;
        this.a &= 0xFFFFDFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.a;
    }

    public jk_0 G() {
        return jk_0.I();
    }

    public jk_0 H() {
        jk_0 jk_02 = this.I();
        if (!jk_02.isInitialized()) {
            throw jm_0.newUninitializedMessageException((Message)jk_02);
        }
        return jk_02;
    }

    public jk_0 I() {
        jk_0 jk_02 = new jk_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        jk_02.r = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        jk_02.s = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        jk_02.t = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        jk_02.u = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        jk_02.v = this.g == null ? this.f : (jo)this.g.build();
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        jk_02.w = this.i == null ? this.h : (jo)this.i.build();
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        jk_02.x = this.j;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        jk_02.y = this.k;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        jk_02.z = this.l;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        jk_02.A = this.m;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        jk_02.B = this.n;
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        jk_02.C = this.o;
        if ((n & 0x1000) == 4096) {
            n2 |= 0x1000;
        }
        jk_02.D = this.p;
        if ((n & 0x2000) == 8192) {
            n2 |= 0x2000;
        }
        jk_02.E = this.q;
        jk_02.q = n2;
        this.onBuilt();
        return jk_02;
    }

    public jm_0 J() {
        return (jm_0)super.clone();
    }

    public jm_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jm_0)super.setField(fieldDescriptor, object);
    }

    public jm_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jm_0)super.clearField(fieldDescriptor);
    }

    public jm_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jm_0)super.clearOneof(oneofDescriptor);
    }

    public jm_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jm_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jm_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jm_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public jm_0 a(Message message) {
        if (message instanceof jk_0) {
            return this.a((jk_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jm_0 a(jk_0 jk_02) {
        if (jk_02 == jk_0.I()) {
            return this;
        }
        if (jk_02.b()) {
            this.a(jk_02.c());
        }
        if (jk_02.d()) {
            this.b(jk_02.e());
        }
        if (jk_02.f()) {
            this.a(jk_02.g());
        }
        if (jk_02.h()) {
            this.b(jk_02.i());
        }
        if (jk_02.j()) {
            this.b(jk_02.k());
        }
        if (jk_02.m()) {
            this.d(jk_02.n());
        }
        if (jk_02.p()) {
            this.c(jk_02.q());
        }
        if (jk_02.r()) {
            this.c(jk_02.s());
        }
        if (jk_02.t()) {
            this.d(jk_02.u());
        }
        if (jk_02.v()) {
            this.e(jk_02.w());
        }
        if (jk_02.x()) {
            this.f(jk_02.y());
        }
        if (jk_02.z()) {
            this.g(jk_02.A());
        }
        if (jk_02.B()) {
            this.h(jk_02.C());
        }
        if (jk_02.D()) {
            this.d(jk_02.E());
        }
        this.b(jk_0.b(jk_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
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
        if (!this.j()) {
            return false;
        }
        if (!this.m()) {
            return false;
        }
        if (!this.p()) {
            return false;
        }
        if (!this.r()) {
            return false;
        }
        if (!this.D()) {
            return false;
        }
        if (!this.k().isInitialized()) {
            return false;
        }
        return this.n().isInitialized();
    }

    public jm_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jk_0 jk_02 = null;
        try {
            jk_02 = (jk_0)jk_0.o.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jk_02 = (jk_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jk_02 != null) {
                this.a(jk_02);
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

    public jm_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public jm_0 K() {
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
    public long e() {
        return this.c;
    }

    public jm_0 b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public jm_0 L() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public int g() {
        return this.d;
    }

    public jm_0 a(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public jm_0 M() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public int i() {
        return this.e;
    }

    public jm_0 b(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public jm_0 N() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public jo k() {
        if (this.g == null) {
            return this.f == null ? jo.m() : this.f;
        }
        return (jo)this.g.getMessage();
    }

    public jm_0 a(jo jo2) {
        if (this.g == null) {
            if (jo2 == null) {
                throw new NullPointerException();
            }
            this.f = jo2;
            this.onChanged();
        } else {
            this.g.setMessage((AbstractMessage)jo2);
        }
        this.a |= 0x10;
        return this;
    }

    public jm_0 a(jq jq2) {
        if (this.g == null) {
            this.f = jq2.l();
            this.onChanged();
        } else {
            this.g.setMessage((AbstractMessage)jq2.l());
        }
        this.a |= 0x10;
        return this;
    }

    public jm_0 b(jo jo2) {
        if (this.g == null) {
            this.f = (this.a & 0x10) == 16 && this.f != null && this.f != jo.m() ? jo.a(this.f).a(jo2).m() : jo2;
            this.onChanged();
        } else {
            this.g.mergeFrom((AbstractMessage)jo2);
        }
        this.a |= 0x10;
        return this;
    }

    public jm_0 O() {
        if (this.g == null) {
            this.f = null;
            this.onChanged();
        } else {
            this.g.clear();
        }
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public jq P() {
        this.a |= 0x10;
        this.onChanged();
        return (jq)this.ab().getBuilder();
    }

    @Override
    public jr l() {
        if (this.g != null) {
            return (jr)this.g.getMessageOrBuilder();
        }
        return this.f == null ? jo.m() : this.f;
    }

    private SingleFieldBuilderV3<jo, jq, jr> ab() {
        if (this.g == null) {
            this.g = new SingleFieldBuilderV3((AbstractMessage)this.k(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.f = null;
        }
        return this.g;
    }

    @Override
    public boolean m() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public jo n() {
        if (this.i == null) {
            return this.h == null ? jo.m() : this.h;
        }
        return (jo)this.i.getMessage();
    }

    public jm_0 c(jo jo2) {
        if (this.i == null) {
            if (jo2 == null) {
                throw new NullPointerException();
            }
            this.h = jo2;
            this.onChanged();
        } else {
            this.i.setMessage((AbstractMessage)jo2);
        }
        this.a |= 0x20;
        return this;
    }

    public jm_0 b(jq jq2) {
        if (this.i == null) {
            this.h = jq2.l();
            this.onChanged();
        } else {
            this.i.setMessage((AbstractMessage)jq2.l());
        }
        this.a |= 0x20;
        return this;
    }

    public jm_0 d(jo jo2) {
        if (this.i == null) {
            this.h = (this.a & 0x20) == 32 && this.h != null && this.h != jo.m() ? jo.a(this.h).a(jo2).m() : jo2;
            this.onChanged();
        } else {
            this.i.mergeFrom((AbstractMessage)jo2);
        }
        this.a |= 0x20;
        return this;
    }

    public jm_0 Q() {
        if (this.i == null) {
            this.h = null;
            this.onChanged();
        } else {
            this.i.clear();
        }
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public jq R() {
        this.a |= 0x20;
        this.onChanged();
        return (jq)this.ac().getBuilder();
    }

    @Override
    public jr o() {
        if (this.i != null) {
            return (jr)this.i.getMessageOrBuilder();
        }
        return this.h == null ? jo.m() : this.h;
    }

    private SingleFieldBuilderV3<jo, jq, jr> ac() {
        if (this.i == null) {
            this.i = new SingleFieldBuilderV3((AbstractMessage)this.n(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.h = null;
        }
        return this.i;
    }

    @Override
    public boolean p() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public long q() {
        return this.j;
    }

    public jm_0 c(long l) {
        this.a |= 0x40;
        this.j = l;
        this.onChanged();
        return this;
    }

    public jm_0 S() {
        this.a &= 0xFFFFFFBF;
        this.j = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean r() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int s() {
        return this.k;
    }

    public jm_0 c(int n) {
        this.a |= 0x80;
        this.k = n;
        this.onChanged();
        return this;
    }

    public jm_0 T() {
        this.a &= 0xFFFFFF7F;
        this.k = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean t() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public int u() {
        return this.l;
    }

    public jm_0 d(int n) {
        this.a |= 0x100;
        this.l = n;
        this.onChanged();
        return this;
    }

    public jm_0 U() {
        this.a &= 0xFFFFFEFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean v() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public int w() {
        return this.m;
    }

    public jm_0 e(int n) {
        this.a |= 0x200;
        this.m = n;
        this.onChanged();
        return this;
    }

    public jm_0 V() {
        this.a &= 0xFFFFFDFF;
        this.m = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean x() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int y() {
        return this.n;
    }

    public jm_0 f(int n) {
        this.a |= 0x400;
        this.n = n;
        this.onChanged();
        return this;
    }

    public jm_0 W() {
        this.a &= 0xFFFFFBFF;
        this.n = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean z() {
        return (this.a & 0x800) == 2048;
    }

    @Override
    public int A() {
        return this.o;
    }

    public jm_0 g(int n) {
        this.a |= 0x800;
        this.o = n;
        this.onChanged();
        return this;
    }

    public jm_0 X() {
        this.a &= 0xFFFFF7FF;
        this.o = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean B() {
        return (this.a & 0x1000) == 4096;
    }

    @Override
    public int C() {
        return this.p;
    }

    public jm_0 h(int n) {
        this.a |= 0x1000;
        this.p = n;
        this.onChanged();
        return this;
    }

    public jm_0 Y() {
        this.a &= 0xFFFFEFFF;
        this.p = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean D() {
        return (this.a & 0x2000) == 8192;
    }

    @Override
    public long E() {
        return this.q;
    }

    public jm_0 d(long l) {
        this.a |= 0x2000;
        this.q = l;
        this.onChanged();
        return this;
    }

    public jm_0 Z() {
        this.a &= 0xFFFFDFFF;
        this.q = 0L;
        this.onChanged();
        return this;
    }

    public final jm_0 a(UnknownFieldSet unknownFieldSet) {
        return (jm_0)super.setUnknownFields(unknownFieldSet);
    }

    public final jm_0 b(UnknownFieldSet unknownFieldSet) {
        return (jm_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.F();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.J();
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
        return this.F();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.J();
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
        return this.J();
    }

    public /* synthetic */ Message buildPartial() {
        return this.I();
    }

    public /* synthetic */ Message build() {
        return this.H();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.F();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.J();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.I();
    }

    public /* synthetic */ MessageLite build() {
        return this.H();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.F();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.G();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.G();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.J();
    }

    public /* synthetic */ Object clone() {
        return this.J();
    }
}

