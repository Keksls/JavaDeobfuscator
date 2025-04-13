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
 * Renamed from aB
 */
public final class ab_2
extends GeneratedMessageV3.Builder<ab_2>
implements ac_2 {
    private int a;
    private av_2 b = null;
    private SingleFieldBuilderV3<av_2, ax_1, ay_2> c;

    public static final Descriptors.Descriptor a() {
        return ao_2.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.f.ensureFieldAccessorsInitialized(az_1.class, ab_2.class);
    }

    ab_2() {
        this.n();
    }

    ab_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (az_1.l()) {
            // empty if block
        }
    }

    public ab_2 f() {
        super.clear();
        this.a = 0;
        if (this.c == null) {
            this.b = null;
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ao_2.e;
    }

    public az_1 g() {
        return az_1.i();
    }

    public az_1 h() {
        az_1 az_12 = this.i();
        if (!az_12.isInitialized()) {
            throw ab_2.newUninitializedMessageException((Message)az_12);
        }
        return az_12;
    }

    public az_1 i() {
        az_1 az_12 = new az_1(this);
        az_12.d = this.a;
        az_12.e = this.c == null ? this.b : (av_2)this.c.build();
        this.onBuilt();
        return az_12;
    }

    public ab_2 j() {
        return (ab_2)super.clone();
    }

    public ab_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ab_2)super.setField(fieldDescriptor, object);
    }

    public ab_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ab_2)super.clearField(fieldDescriptor);
    }

    public ab_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ab_2)super.clearOneof(oneofDescriptor);
    }

    public ab_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ab_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ab_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ab_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ab_2 a(Message message) {
        if (message instanceof az_1) {
            return this.a((az_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ab_2 a(az_1 az_12) {
        if (az_12 == az_1.i()) {
            return this;
        }
        if (az_12.b() != 0) {
            this.a(az_12.b());
        }
        if (az_12.c()) {
            this.b(az_12.d());
        }
        this.b(az_1.b(az_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ab_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        az_1 az_12 = null;
        try {
            az_12 = (az_1)az_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            az_12 = (az_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (az_12 != null) {
                this.a(az_12);
            }
        }
        return this;
    }

    @Override
    public int b() {
        return this.a;
    }

    public ab_2 a(int n) {
        this.a = n;
        this.onChanged();
        return this;
    }

    public ab_2 k() {
        this.a = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.c != null || this.b != null;
    }

    @Override
    public av_2 d() {
        if (this.c == null) {
            return this.b == null ? av_2.g() : this.b;
        }
        return (av_2)this.c.getMessage();
    }

    public ab_2 a(av_2 av_22) {
        if (this.c == null) {
            if (av_22 == null) {
                throw new NullPointerException();
            }
            this.b = av_22;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)av_22);
        }
        return this;
    }

    public ab_2 a(ax_1 ax_12) {
        if (this.c == null) {
            this.b = ax_12.f();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)ax_12.f());
        }
        return this;
    }

    public ab_2 b(av_2 av_22) {
        if (this.c == null) {
            this.b = this.b != null ? av_2.a(this.b).a(av_22).g() : av_22;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)av_22);
        }
        return this;
    }

    public ab_2 l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public ax_1 m() {
        this.onChanged();
        return (ax_1)this.o().getBuilder();
    }

    @Override
    public ay_2 e() {
        if (this.c != null) {
            return (ay_2)this.c.getMessageOrBuilder();
        }
        return this.b == null ? av_2.g() : this.b;
    }

    private SingleFieldBuilderV3<av_2, ax_1, ay_2> o() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.d(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ab_2 a(UnknownFieldSet unknownFieldSet) {
        return (ab_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final ab_2 b(UnknownFieldSet unknownFieldSet) {
        return (ab_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

