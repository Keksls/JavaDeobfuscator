/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
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
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from iM
 */
public final class im_0
extends GeneratedMessageV3.Builder<im_0>
implements in_0 {
    private int a;
    private int b;
    private int c;
    private int d;

    public static final Descriptors.Descriptor a() {
        return io_0.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.n.ensureFieldAccessorsInitialized(ik_0.class, im_0.class);
    }

    im_0() {
        this.p();
    }

    im_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (ik_0.n()) {
            // empty if block
        }
    }

    public im_0 h() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return io_0.m;
    }

    public ik_0 i() {
        return ik_0.k();
    }

    public ik_0 j() {
        ik_0 ik_02 = this.k();
        if (!ik_02.isInitialized()) {
            throw im_0.newUninitializedMessageException((Message)ik_02);
        }
        return ik_02;
    }

    public ik_0 k() {
        ik_0 ik_02 = new ik_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ik_02.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ik_02.h = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ik_02.i = this.d;
        ik_02.f = n2;
        this.onBuilt();
        return ik_02;
    }

    public im_0 l() {
        return (im_0)super.clone();
    }

    public im_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (im_0)super.setField(fieldDescriptor, object);
    }

    public im_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (im_0)super.clearField(fieldDescriptor);
    }

    public im_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (im_0)super.clearOneof(oneofDescriptor);
    }

    public im_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (im_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public im_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (im_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public im_0 a(Message message) {
        if (message instanceof ik_0) {
            return this.a((ik_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public im_0 a(ik_0 ik_02) {
        if (ik_02 == ik_0.k()) {
            return this;
        }
        if (ik_02.b()) {
            this.a(ik_02.c());
        }
        if (ik_02.d()) {
            this.b(ik_02.e());
        }
        if (ik_02.f()) {
            this.c(ik_02.g());
        }
        this.b(ik_0.b(ik_02));
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
        return this.f();
    }

    public im_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ik_0 ik_02 = null;
        try {
            ik_02 = (ik_0)ik_0.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ik_02 = (ik_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ik_02 != null) {
                this.a(ik_02);
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

    public im_0 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public im_0 m() {
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

    public im_0 b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public im_0 n() {
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

    public im_0 c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public im_0 o() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    public final im_0 a(UnknownFieldSet unknownFieldSet) {
        return (im_0)super.setUnknownFields(unknownFieldSet);
    }

    public final im_0 b(UnknownFieldSet unknownFieldSet) {
        return (im_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
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
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
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
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

