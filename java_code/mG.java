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

public final class mG
extends GeneratedMessageV3.Builder<mG>
implements mH {
    private int a;
    private long b;
    private int c = 0;
    private long d;
    private long e;
    private int f;
    private long g;
    private le_0 h = null;
    private SingleFieldBuilderV3<le_0, lg, lp> i;

    public static final Descriptors.Descriptor a() {
        return mC.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mC.d.ensureFieldAccessorsInitialized(mE.class, mG.class);
    }

    mG() {
        this.D();
    }

    mG(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mE.w()) {
            this.E();
        }
    }

    public mG q() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        this.e = 0L;
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = 0L;
        this.a &= 0xFFFFFFDF;
        if (this.i == null) {
            this.h = null;
        } else {
            this.i.clear();
        }
        this.a &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mC.c;
    }

    public mE r() {
        return mE.t();
    }

    public mE s() {
        mE mE2 = this.t();
        if (!mE2.isInitialized()) {
            throw mG.newUninitializedMessageException((Message)mE2);
        }
        return mE2;
    }

    public mE t() {
        mE mE2 = new mE(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mE2.k = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        mE2.l = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        mE2.m = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        mE2.n = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        mE2.o = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        mE2.p = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        mE2.q = this.i == null ? this.h : (le_0)this.i.build();
        mE2.j = n2;
        this.onBuilt();
        return mE2;
    }

    public mG u() {
        return (mG)super.clone();
    }

    public mG a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mG)super.setField(fieldDescriptor, object);
    }

    public mG a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mG)super.clearField(fieldDescriptor);
    }

    public mG a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mG)super.clearOneof(oneofDescriptor);
    }

    public mG a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mG)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mG b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mG)super.addRepeatedField(fieldDescriptor, object);
    }

    public mG a(Message message) {
        if (message instanceof mE) {
            return this.a((mE)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mG a(mE mE2) {
        if (mE2 == mE.t()) {
            return this;
        }
        if (mE2.b()) {
            this.a(mE2.c());
        }
        if (mE2.d()) {
            this.a(mE2.e());
        }
        if (mE2.f()) {
            this.b(mE2.g());
        }
        if (mE2.h()) {
            this.c(mE2.i());
        }
        if (mE2.j()) {
            this.a(mE2.k());
        }
        if (mE2.l()) {
            this.d(mE2.m());
        }
        if (mE2.n()) {
            this.b(mE2.o());
        }
        this.b(mE.b(mE2));
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
        if (!this.l()) {
            return false;
        }
        if (!this.n()) {
            return false;
        }
        return this.o().isInitialized();
    }

    public mG a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mE mE2 = null;
        try {
            mE2 = (mE)mE.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mE2 = (mE)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mE2 != null) {
                this.a(mE2);
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

    public mG a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public mG v() {
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
    public mI e() {
        mI mI2 = mI.a(this.c);
        return mI2 == null ? mI.a : mI2;
    }

    public mG a(mI mI2) {
        if (mI2 == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = mI2.getNumber();
        this.onChanged();
        return this;
    }

    public mG w() {
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

    public mG b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public mG x() {
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
    public long i() {
        return this.e;
    }

    public mG c(long l) {
        this.a |= 8;
        this.e = l;
        this.onChanged();
        return this;
    }

    public mG y() {
        this.a &= 0xFFFFFFF7;
        this.e = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.f;
    }

    public mG a(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public mG z() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public long m() {
        return this.g;
    }

    public mG d(long l) {
        this.a |= 0x20;
        this.g = l;
        this.onChanged();
        return this;
    }

    public mG A() {
        this.a &= 0xFFFFFFDF;
        this.g = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public le_0 o() {
        if (this.i == null) {
            return this.h == null ? le_0.H() : this.h;
        }
        return (le_0)this.i.getMessage();
    }

    public mG a(le_0 le_02) {
        if (this.i == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.h = le_02;
            this.onChanged();
        } else {
            this.i.setMessage((AbstractMessage)le_02);
        }
        this.a |= 0x40;
        return this;
    }

    public mG a(lg lg2) {
        if (this.i == null) {
            this.h = lg2.G();
            this.onChanged();
        } else {
            this.i.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 0x40;
        return this;
    }

    public mG b(le_0 le_02) {
        if (this.i == null) {
            this.h = (this.a & 0x40) == 64 && this.h != null && this.h != le_0.H() ? le_0.a(this.h).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.i.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 0x40;
        return this;
    }

    public mG B() {
        if (this.i == null) {
            this.h = null;
            this.onChanged();
        } else {
            this.i.clear();
        }
        this.a &= 0xFFFFFFBF;
        return this;
    }

    public lg C() {
        this.a |= 0x40;
        this.onChanged();
        return (lg)this.E().getBuilder();
    }

    @Override
    public lp p() {
        if (this.i != null) {
            return (lp)this.i.getMessageOrBuilder();
        }
        return this.h == null ? le_0.H() : this.h;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> E() {
        if (this.i == null) {
            this.i = new SingleFieldBuilderV3((AbstractMessage)this.o(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.h = null;
        }
        return this.i;
    }

    public final mG a(UnknownFieldSet unknownFieldSet) {
        return (mG)super.setUnknownFields(unknownFieldSet);
    }

    public final mG b(UnknownFieldSet unknownFieldSet) {
        return (mG)super.mergeUnknownFields(unknownFieldSet);
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
        return this.q();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.u();
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
        return this.q();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.u();
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
        return this.u();
    }

    public /* synthetic */ Message buildPartial() {
        return this.t();
    }

    public /* synthetic */ Message build() {
        return this.s();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.q();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.u();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.t();
    }

    public /* synthetic */ MessageLite build() {
        return this.s();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.q();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.u();
    }

    public /* synthetic */ Object clone() {
        return this.u();
    }
}

