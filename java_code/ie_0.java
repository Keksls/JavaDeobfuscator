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
 * Renamed from iE
 */
public final class ie_0
extends GeneratedMessageV3.Builder<ie_0>
implements if_0 {
    private int a;
    private boolean b;
    private int c;
    private iy_1 d = null;
    private SingleFieldBuilderV3<iy_1, ia_1, ib_1> e;
    private long f;
    private boolean g;

    public static final Descriptors.Descriptor a() {
        return io_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.f.ensureFieldAccessorsInitialized(ic_1.class, ie_0.class);
    }

    ie_0() {
        this.x();
    }

    ie_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.x();
    }

    private void x() {
        if (ic_1.s()) {
            this.y();
        }
    }

    public ie_0 m() {
        super.clear();
        this.b = false;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        if (this.e == null) {
            this.d = null;
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFB;
        this.f = 0L;
        this.a &= 0xFFFFFFF7;
        this.g = false;
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return io_0.e;
    }

    public ic_1 n() {
        return ic_1.p();
    }

    public ic_1 o() {
        ic_1 ic_12 = this.p();
        if (!ic_12.isInitialized()) {
            throw ie_0.newUninitializedMessageException((Message)ic_12);
        }
        return ic_12;
    }

    public ic_1 p() {
        ic_1 ic_12 = new ic_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ic_12.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ic_12.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ic_12.k = this.e == null ? this.d : (iy_1)this.e.build();
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        ic_12.l = this.f;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        ic_12.m = this.g;
        ic_12.h = n2;
        this.onBuilt();
        return ic_12;
    }

    public ie_0 q() {
        return (ie_0)super.clone();
    }

    public ie_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ie_0)super.setField(fieldDescriptor, object);
    }

    public ie_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ie_0)super.clearField(fieldDescriptor);
    }

    public ie_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ie_0)super.clearOneof(oneofDescriptor);
    }

    public ie_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ie_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ie_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ie_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ie_0 a(Message message) {
        if (message instanceof ic_1) {
            return this.a((ic_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ie_0 a(ic_1 ic_12) {
        if (ic_12 == ic_1.p()) {
            return this;
        }
        if (ic_12.b()) {
            this.a(ic_12.c());
        }
        if (ic_12.d()) {
            this.a(ic_12.e());
        }
        if (ic_12.f()) {
            this.b(ic_12.g());
        }
        if (ic_12.i()) {
            this.a(ic_12.j());
        }
        if (ic_12.k()) {
            this.b(ic_12.l());
        }
        this.b(ic_1.b(ic_12));
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
        return this.g().isInitialized();
    }

    public ie_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ic_1 ic_12 = null;
        try {
            ic_12 = (ic_1)ic_1.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ic_12 = (ic_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ic_12 != null) {
                this.a(ic_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public boolean c() {
        return this.b;
    }

    public ie_0 a(boolean bl) {
        this.a |= 1;
        this.b = bl;
        this.onChanged();
        return this;
    }

    public ie_0 r() {
        this.a &= 0xFFFFFFFE;
        this.b = false;
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

    public ie_0 a(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public ie_0 s() {
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
    public iy_1 g() {
        if (this.e == null) {
            return this.d == null ? iy_1.k() : this.d;
        }
        return (iy_1)this.e.getMessage();
    }

    public ie_0 a(iy_1 iy_12) {
        if (this.e == null) {
            if (iy_12 == null) {
                throw new NullPointerException();
            }
            this.d = iy_12;
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)iy_12);
        }
        this.a |= 4;
        return this;
    }

    public ie_0 a(ia_1 ia_12) {
        if (this.e == null) {
            this.d = ia_12.j();
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)ia_12.j());
        }
        this.a |= 4;
        return this;
    }

    public ie_0 b(iy_1 iy_12) {
        if (this.e == null) {
            this.d = (this.a & 4) == 4 && this.d != null && this.d != iy_1.k() ? iy_1.a(this.d).a(iy_12).k() : iy_12;
            this.onChanged();
        } else {
            this.e.mergeFrom((AbstractMessage)iy_12);
        }
        this.a |= 4;
        return this;
    }

    public ie_0 t() {
        if (this.e == null) {
            this.d = null;
            this.onChanged();
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public ia_1 u() {
        this.a |= 4;
        this.onChanged();
        return (ia_1)this.y().getBuilder();
    }

    @Override
    public ib_1 h() {
        if (this.e != null) {
            return (ib_1)this.e.getMessageOrBuilder();
        }
        return this.d == null ? iy_1.k() : this.d;
    }

    private SingleFieldBuilderV3<iy_1, ia_1, ib_1> y() {
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
    public long j() {
        return this.f;
    }

    public ie_0 a(long l) {
        this.a |= 8;
        this.f = l;
        this.onChanged();
        return this;
    }

    public ie_0 v() {
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
    public boolean l() {
        return this.g;
    }

    public ie_0 b(boolean bl) {
        this.a |= 0x10;
        this.g = bl;
        this.onChanged();
        return this;
    }

    public ie_0 w() {
        this.a &= 0xFFFFFFEF;
        this.g = false;
        this.onChanged();
        return this;
    }

    public final ie_0 a(UnknownFieldSet unknownFieldSet) {
        return (ie_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ie_0 b(UnknownFieldSet unknownFieldSet) {
        return (ie_0)super.mergeUnknownFields(unknownFieldSet);
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

