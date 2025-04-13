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

public final class nc
extends GeneratedMessageV3.Builder<nc>
implements nd {
    private int a;
    private long b;
    private long c;
    private le_0 d = null;
    private SingleFieldBuilderV3<le_0, lg, lp> e;
    private int f;
    private long g;
    private long h;

    public static final Descriptors.Descriptor a() {
        return mY.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mY.d.ensureFieldAccessorsInitialized(na.class, nc.class);
    }

    nc() {
        this.A();
    }

    nc(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.A();
    }

    private void A() {
        if (na.u()) {
            this.B();
        }
    }

    public nc o() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        if (this.e == null) {
            this.d = null;
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFB;
        this.f = 0;
        this.a &= 0xFFFFFFF7;
        this.g = 0L;
        this.a &= 0xFFFFFFEF;
        this.h = 0L;
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mY.c;
    }

    public na p() {
        return na.r();
    }

    public na q() {
        na na2 = this.r();
        if (!na2.isInitialized()) {
            throw nc.newUninitializedMessageException((Message)na2);
        }
        return na2;
    }

    public na r() {
        na na2 = new na(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        na2.j = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        na2.k = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        na2.l = this.e == null ? this.d : (le_0)this.e.build();
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        na2.m = this.f;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        na2.n = this.g;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        na2.o = this.h;
        na2.i = n2;
        this.onBuilt();
        return na2;
    }

    public nc s() {
        return (nc)super.clone();
    }

    public nc a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nc)super.setField(fieldDescriptor, object);
    }

    public nc a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nc)super.clearField(fieldDescriptor);
    }

    public nc a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nc)super.clearOneof(oneofDescriptor);
    }

    public nc a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nc)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nc b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nc)super.addRepeatedField(fieldDescriptor, object);
    }

    public nc a(Message message) {
        if (message instanceof na) {
            return this.a((na)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nc a(na na2) {
        if (na2 == na.r()) {
            return this;
        }
        if (na2.b()) {
            this.a(na2.c());
        }
        if (na2.d()) {
            this.b(na2.e());
        }
        if (na2.f()) {
            this.b(na2.g());
        }
        if (na2.i()) {
            this.a(na2.j());
        }
        if (na2.k()) {
            this.c(na2.l());
        }
        if (na2.m()) {
            this.d(na2.n());
        }
        this.b(na.b(na2));
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
        if (!this.i()) {
            return false;
        }
        if (!this.k()) {
            return false;
        }
        if (!this.m()) {
            return false;
        }
        return this.g().isInitialized();
    }

    public nc a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        na na2 = null;
        try {
            na2 = (na)na.g.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            na2 = (na)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (na2 != null) {
                this.a(na2);
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

    public nc a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public nc t() {
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

    public nc b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public nc u() {
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
    public le_0 g() {
        if (this.e == null) {
            return this.d == null ? le_0.H() : this.d;
        }
        return (le_0)this.e.getMessage();
    }

    public nc a(le_0 le_02) {
        if (this.e == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.d = le_02;
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)le_02);
        }
        this.a |= 4;
        return this;
    }

    public nc a(lg lg2) {
        if (this.e == null) {
            this.d = lg2.G();
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 4;
        return this;
    }

    public nc b(le_0 le_02) {
        if (this.e == null) {
            this.d = (this.a & 4) == 4 && this.d != null && this.d != le_0.H() ? le_0.a(this.d).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.e.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 4;
        return this;
    }

    public nc v() {
        if (this.e == null) {
            this.d = null;
            this.onChanged();
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public lg w() {
        this.a |= 4;
        this.onChanged();
        return (lg)this.B().getBuilder();
    }

    @Override
    public lp h() {
        if (this.e != null) {
            return (lp)this.e.getMessageOrBuilder();
        }
        return this.d == null ? le_0.H() : this.d;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> B() {
        if (this.e == null) {
            this.e = new SingleFieldBuilderV3((AbstractMessage)this.g(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public int j() {
        return this.f;
    }

    public nc a(int n) {
        this.a |= 8;
        this.f = n;
        this.onChanged();
        return this;
    }

    public nc x() {
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public long l() {
        return this.g;
    }

    public nc c(long l) {
        this.a |= 0x10;
        this.g = l;
        this.onChanged();
        return this;
    }

    public nc y() {
        this.a &= 0xFFFFFFEF;
        this.g = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean m() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public long n() {
        return this.h;
    }

    public nc d(long l) {
        this.a |= 0x20;
        this.h = l;
        this.onChanged();
        return this;
    }

    public nc z() {
        this.a &= 0xFFFFFFDF;
        this.h = 0L;
        this.onChanged();
        return this;
    }

    public final nc a(UnknownFieldSet unknownFieldSet) {
        return (nc)super.setUnknownFields(unknownFieldSet);
    }

    public final nc b(UnknownFieldSet unknownFieldSet) {
        return (nc)super.mergeUnknownFields(unknownFieldSet);
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
        return this.o();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.s();
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
        return this.o();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.s();
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
        return this.s();
    }

    public /* synthetic */ Message buildPartial() {
        return this.r();
    }

    public /* synthetic */ Message build() {
        return this.q();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.s();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.r();
    }

    public /* synthetic */ MessageLite build() {
        return this.q();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.o();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.s();
    }

    public /* synthetic */ Object clone() {
        return this.s();
    }
}

