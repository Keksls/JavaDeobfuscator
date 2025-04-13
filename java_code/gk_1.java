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
 * Renamed from gK
 */
public final class gk_1
extends GeneratedMessageV3.Builder<gk_1>
implements gl_1 {
    private int a;
    private long b;
    private int c;
    private long d;

    public static final Descriptors.Descriptor a() {
        return gd_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_0.d.ensureFieldAccessorsInitialized(gi_1.class, gk_1.class);
    }

    gk_1() {
        this.p();
    }

    gk_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (gi_1.n()) {
            // empty if block
        }
    }

    public gk_1 h() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gd_0.c;
    }

    public gi_1 i() {
        return gi_1.k();
    }

    public gi_1 j() {
        gi_1 gi_12 = this.k();
        if (!gi_12.isInitialized()) {
            throw gk_1.newUninitializedMessageException((Message)gi_12);
        }
        return gi_12;
    }

    public gi_1 k() {
        gi_1 gi_12 = new gi_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        gi_12.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        gi_12.h = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        gi_12.i = this.d;
        gi_12.f = n2;
        this.onBuilt();
        return gi_12;
    }

    public gk_1 l() {
        return (gk_1)super.clone();
    }

    public gk_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gk_1)super.setField(fieldDescriptor, object);
    }

    public gk_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gk_1)super.clearField(fieldDescriptor);
    }

    public gk_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gk_1)super.clearOneof(oneofDescriptor);
    }

    public gk_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gk_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gk_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gk_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gk_1 a(Message message) {
        if (message instanceof gi_1) {
            return this.a((gi_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gk_1 a(gi_1 gi_12) {
        if (gi_12 == gi_1.k()) {
            return this;
        }
        if (gi_12.b()) {
            this.a(gi_12.c());
        }
        if (gi_12.d()) {
            this.a(gi_12.e());
        }
        if (gi_12.f()) {
            this.b(gi_12.g());
        }
        this.b(gi_1.b(gi_12));
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

    public gk_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gi_1 gi_12 = null;
        try {
            gi_12 = (gi_1)gi_1.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gi_12 = (gi_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gi_12 != null) {
                this.a(gi_12);
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

    public gk_1 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public gk_1 m() {
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

    public gk_1 a(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public gk_1 n() {
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

    public gk_1 b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public gk_1 o() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
        this.onChanged();
        return this;
    }

    public final gk_1 a(UnknownFieldSet unknownFieldSet) {
        return (gk_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gk_1 b(UnknownFieldSet unknownFieldSet) {
        return (gk_1)super.mergeUnknownFields(unknownFieldSet);
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

