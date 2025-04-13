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
 * Renamed from os
 */
public final class os_1
extends GeneratedMessageV3.Builder<os_1>
implements ox_2 {
    private int a;
    private int b;
    private int c;
    private int d;
    private oy_2 e = null;
    private SingleFieldBuilderV3<oy_2, oa_1, ob_1> f;
    private oy_2 g = null;
    private SingleFieldBuilderV3<oy_2, oa_1, ob_1> h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private int n;
    private int o;

    public static final Descriptors.Descriptor a() {
        return oo_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo_1.d.ensureFieldAccessorsInitialized(oq_1.class, os_1.class);
    }

    os_1() {
        this.U();
    }

    os_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.U();
    }

    private void U() {
        if (oq_1.H()) {
            this.V();
            this.W();
        }
    }

    public os_1 B() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        if (this.f == null) {
            this.e = null;
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFF7;
        if (this.h == null) {
            this.g = null;
        } else {
            this.h.clear();
        }
        this.a &= 0xFFFFFFEF;
        this.i = 0L;
        this.a &= 0xFFFFFFDF;
        this.j = 0;
        this.a &= 0xFFFFFFBF;
        this.k = 0;
        this.a &= 0xFFFFFF7F;
        this.l = 0;
        this.a &= 0xFFFFFEFF;
        this.m = 0L;
        this.a &= 0xFFFFFDFF;
        this.n = 0;
        this.a &= 0xFFFFFBFF;
        this.o = 0;
        this.a &= 0xFFFFF7FF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return oo_1.c;
    }

    public oq_1 C() {
        return oq_1.E();
    }

    public oq_1 D() {
        oq_1 oq_12 = this.E();
        if (!oq_12.isInitialized()) {
            throw os_1.newUninitializedMessageException((Message)oq_12);
        }
        return oq_12;
    }

    public oq_1 E() {
        oq_1 oq_12 = new oq_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        oq_12.p = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        oq_12.q = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        oq_12.r = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        oq_12.s = this.f == null ? this.e : (oy_2)this.f.build();
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        oq_12.t = this.h == null ? this.g : (oy_2)this.h.build();
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        oq_12.u = this.i;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        oq_12.v = this.j;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        oq_12.w = this.k;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        oq_12.x = this.l;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        oq_12.y = this.m;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        oq_12.z = this.n;
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        oq_12.A = this.o;
        oq_12.o = n2;
        this.onBuilt();
        return oq_12;
    }

    public os_1 F() {
        return (os_1)super.clone();
    }

    public os_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (os_1)super.setField(fieldDescriptor, object);
    }

    public os_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (os_1)super.clearField(fieldDescriptor);
    }

    public os_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (os_1)super.clearOneof(oneofDescriptor);
    }

    public os_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (os_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public os_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (os_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public os_1 a(Message message) {
        if (message instanceof oq_1) {
            return this.a((oq_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public os_1 a(oq_1 oq_12) {
        if (oq_12 == oq_1.E()) {
            return this;
        }
        if (oq_12.b()) {
            this.a(oq_12.c());
        }
        if (oq_12.d()) {
            this.b(oq_12.e());
        }
        if (oq_12.f()) {
            this.c(oq_12.g());
        }
        if (oq_12.h()) {
            this.b(oq_12.i());
        }
        if (oq_12.k()) {
            this.d(oq_12.l());
        }
        if (oq_12.n()) {
            this.a(oq_12.o());
        }
        if (oq_12.p()) {
            this.d(oq_12.q());
        }
        if (oq_12.r()) {
            this.e(oq_12.s());
        }
        if (oq_12.t()) {
            this.f(oq_12.u());
        }
        if (oq_12.v()) {
            this.b(oq_12.w());
        }
        if (oq_12.x()) {
            this.g(oq_12.y());
        }
        if (oq_12.z()) {
            this.h(oq_12.A());
        }
        this.b(oq_1.b(oq_12));
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
        if (!this.k()) {
            return false;
        }
        if (!this.n()) {
            return false;
        }
        if (!this.i().isInitialized()) {
            return false;
        }
        return this.l().isInitialized();
    }

    public os_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        oq_1 oq_12 = null;
        try {
            oq_12 = (oq_1)oq_1.m.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            oq_12 = (oq_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (oq_12 != null) {
                this.a(oq_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public os_1 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public os_1 G() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
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

    public os_1 b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public os_1 H() {
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
    public int g() {
        return this.d;
    }

    public os_1 c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public os_1 I() {
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
    public oy_2 i() {
        if (this.f == null) {
            return this.e == null ? oy_2.i() : this.e;
        }
        return (oy_2)this.f.getMessage();
    }

    public os_1 a(oy_2 oy_22) {
        if (this.f == null) {
            if (oy_22 == null) {
                throw new NullPointerException();
            }
            this.e = oy_22;
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)oy_22);
        }
        this.a |= 8;
        return this;
    }

    public os_1 a(oa_1 oa_12) {
        if (this.f == null) {
            this.e = oa_12.h();
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)oa_12.h());
        }
        this.a |= 8;
        return this;
    }

    public os_1 b(oy_2 oy_22) {
        if (this.f == null) {
            this.e = (this.a & 8) == 8 && this.e != null && this.e != oy_2.i() ? oy_2.a(this.e).a(oy_22).i() : oy_22;
            this.onChanged();
        } else {
            this.f.mergeFrom((AbstractMessage)oy_22);
        }
        this.a |= 8;
        return this;
    }

    public os_1 J() {
        if (this.f == null) {
            this.e = null;
            this.onChanged();
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public oa_1 K() {
        this.a |= 8;
        this.onChanged();
        return (oa_1)this.V().getBuilder();
    }

    @Override
    public ob_1 j() {
        if (this.f != null) {
            return (ob_1)this.f.getMessageOrBuilder();
        }
        return this.e == null ? oy_2.i() : this.e;
    }

    private SingleFieldBuilderV3<oy_2, oa_1, ob_1> V() {
        if (this.f == null) {
            this.f = new SingleFieldBuilderV3((AbstractMessage)this.i(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public oy_2 l() {
        if (this.h == null) {
            return this.g == null ? oy_2.i() : this.g;
        }
        return (oy_2)this.h.getMessage();
    }

    public os_1 c(oy_2 oy_22) {
        if (this.h == null) {
            if (oy_22 == null) {
                throw new NullPointerException();
            }
            this.g = oy_22;
            this.onChanged();
        } else {
            this.h.setMessage((AbstractMessage)oy_22);
        }
        this.a |= 0x10;
        return this;
    }

    public os_1 b(oa_1 oa_12) {
        if (this.h == null) {
            this.g = oa_12.h();
            this.onChanged();
        } else {
            this.h.setMessage((AbstractMessage)oa_12.h());
        }
        this.a |= 0x10;
        return this;
    }

    public os_1 d(oy_2 oy_22) {
        if (this.h == null) {
            this.g = (this.a & 0x10) == 16 && this.g != null && this.g != oy_2.i() ? oy_2.a(this.g).a(oy_22).i() : oy_22;
            this.onChanged();
        } else {
            this.h.mergeFrom((AbstractMessage)oy_22);
        }
        this.a |= 0x10;
        return this;
    }

    public os_1 L() {
        if (this.h == null) {
            this.g = null;
            this.onChanged();
        } else {
            this.h.clear();
        }
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public oa_1 M() {
        this.a |= 0x10;
        this.onChanged();
        return (oa_1)this.W().getBuilder();
    }

    @Override
    public ob_1 m() {
        if (this.h != null) {
            return (ob_1)this.h.getMessageOrBuilder();
        }
        return this.g == null ? oy_2.i() : this.g;
    }

    private SingleFieldBuilderV3<oy_2, oa_1, ob_1> W() {
        if (this.h == null) {
            this.h = new SingleFieldBuilderV3((AbstractMessage)this.l(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.g = null;
        }
        return this.h;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public long o() {
        return this.i;
    }

    public os_1 a(long l) {
        this.a |= 0x20;
        this.i = l;
        this.onChanged();
        return this;
    }

    public os_1 N() {
        this.a &= 0xFFFFFFDF;
        this.i = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.j;
    }

    public os_1 d(int n) {
        this.a |= 0x40;
        this.j = n;
        this.onChanged();
        return this;
    }

    public os_1 O() {
        this.a &= 0xFFFFFFBF;
        this.j = 0;
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

    public os_1 e(int n) {
        this.a |= 0x80;
        this.k = n;
        this.onChanged();
        return this;
    }

    public os_1 P() {
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

    public os_1 f(int n) {
        this.a |= 0x100;
        this.l = n;
        this.onChanged();
        return this;
    }

    public os_1 Q() {
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
    public long w() {
        return this.m;
    }

    public os_1 b(long l) {
        this.a |= 0x200;
        this.m = l;
        this.onChanged();
        return this;
    }

    public os_1 R() {
        this.a &= 0xFFFFFDFF;
        this.m = 0L;
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

    public os_1 g(int n) {
        this.a |= 0x400;
        this.n = n;
        this.onChanged();
        return this;
    }

    public os_1 S() {
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

    public os_1 h(int n) {
        this.a |= 0x800;
        this.o = n;
        this.onChanged();
        return this;
    }

    public os_1 T() {
        this.a &= 0xFFFFF7FF;
        this.o = 0;
        this.onChanged();
        return this;
    }

    public final os_1 a(UnknownFieldSet unknownFieldSet) {
        return (os_1)super.setUnknownFields(unknownFieldSet);
    }

    public final os_1 b(UnknownFieldSet unknownFieldSet) {
        return (os_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.B();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.F();
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
        return this.B();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.F();
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
        return this.F();
    }

    public /* synthetic */ Message buildPartial() {
        return this.E();
    }

    public /* synthetic */ Message build() {
        return this.D();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.B();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.F();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.E();
    }

    public /* synthetic */ MessageLite build() {
        return this.D();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.B();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.C();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.C();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.F();
    }

    public /* synthetic */ Object clone() {
        return this.F();
    }
}

