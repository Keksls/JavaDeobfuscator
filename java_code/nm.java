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

public final class nm
extends GeneratedMessageV3.Builder<nm>
implements nn {
    private int a;
    private long b;
    private le_0 c = null;
    private SingleFieldBuilderV3<le_0, lg, lp> d;
    private int e;
    private long f;
    private long g;

    public static final Descriptors.Descriptor a() {
        return ni.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ni.d.ensureFieldAccessorsInitialized(nk.class, nm.class);
    }

    nm() {
        this.x();
    }

    nm(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.x();
    }

    private void x() {
        if (nk.s()) {
            this.y();
        }
    }

    public nm m() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        this.e = 0;
        this.a &= 0xFFFFFFFB;
        this.f = 0L;
        this.a &= 0xFFFFFFF7;
        this.g = 0L;
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ni.c;
    }

    public nk n() {
        return nk.p();
    }

    public nk o() {
        nk nk2 = this.p();
        if (!nk2.isInitialized()) {
            throw nm.newUninitializedMessageException((Message)nk2);
        }
        return nk2;
    }

    public nk p() {
        nk nk2 = new nk(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        nk2.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        nk2.j = this.d == null ? this.c : (le_0)this.d.build();
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        nk2.k = this.e;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        nk2.l = this.f;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        nk2.m = this.g;
        nk2.h = n2;
        this.onBuilt();
        return nk2;
    }

    public nm q() {
        return (nm)super.clone();
    }

    public nm a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nm)super.setField(fieldDescriptor, object);
    }

    public nm a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nm)super.clearField(fieldDescriptor);
    }

    public nm a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nm)super.clearOneof(oneofDescriptor);
    }

    public nm a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nm)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nm b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nm)super.addRepeatedField(fieldDescriptor, object);
    }

    public nm a(Message message) {
        if (message instanceof nk) {
            return this.a((nk)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nm a(nk nk2) {
        if (nk2 == nk.p()) {
            return this;
        }
        if (nk2.b()) {
            this.a(nk2.c());
        }
        if (nk2.d()) {
            this.b(nk2.e());
        }
        if (nk2.g()) {
            this.a(nk2.h());
        }
        if (nk2.i()) {
            this.b(nk2.j());
        }
        if (nk2.k()) {
            this.c(nk2.l());
        }
        this.b(nk.b(nk2));
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
        if (!this.g()) {
            return false;
        }
        if (!this.i()) {
            return false;
        }
        if (!this.k()) {
            return false;
        }
        return this.e().isInitialized();
    }

    public nm a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nk nk2 = null;
        try {
            nk2 = (nk)nk.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nk2 = (nk)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nk2 != null) {
                this.a(nk2);
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

    public nm a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public nm r() {
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
    public le_0 e() {
        if (this.d == null) {
            return this.c == null ? le_0.H() : this.c;
        }
        return (le_0)this.d.getMessage();
    }

    public nm a(le_0 le_02) {
        if (this.d == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.c = le_02;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)le_02);
        }
        this.a |= 2;
        return this;
    }

    public nm a(lg lg2) {
        if (this.d == null) {
            this.c = lg2.G();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 2;
        return this;
    }

    public nm b(le_0 le_02) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != le_0.H() ? le_0.a(this.c).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 2;
        return this;
    }

    public nm s() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public lg t() {
        this.a |= 2;
        this.onChanged();
        return (lg)this.y().getBuilder();
    }

    @Override
    public lp f() {
        if (this.d != null) {
            return (lp)this.d.getMessageOrBuilder();
        }
        return this.c == null ? le_0.H() : this.c;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> y() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public int h() {
        return this.e;
    }

    public nm a(int n) {
        this.a |= 4;
        this.e = n;
        this.onChanged();
        return this;
    }

    public nm u() {
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public long j() {
        return this.f;
    }

    public nm b(long l) {
        this.a |= 8;
        this.f = l;
        this.onChanged();
        return this;
    }

    public nm v() {
        this.a &= 0xFFFFFFF7;
        this.f = 0L;
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

    public nm c(long l) {
        this.a |= 0x10;
        this.g = l;
        this.onChanged();
        return this;
    }

    public nm w() {
        this.a &= 0xFFFFFFEF;
        this.g = 0L;
        this.onChanged();
        return this;
    }

    public final nm a(UnknownFieldSet unknownFieldSet) {
        return (nm)super.setUnknownFields(unknownFieldSet);
    }

    public final nm b(UnknownFieldSet unknownFieldSet) {
        return (nm)super.mergeUnknownFields(unknownFieldSet);
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
        return this.m();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.q();
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
        return this.m();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.q();
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
        return this.q();
    }

    public /* synthetic */ Message buildPartial() {
        return this.p();
    }

    public /* synthetic */ Message build() {
        return this.o();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.p();
    }

    public /* synthetic */ MessageLite build() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Object clone() {
        return this.q();
    }
}

