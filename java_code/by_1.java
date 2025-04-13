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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from by
 */
public final class by_1
extends GeneratedMessageV3.Builder<by_1>
implements bz_2 {
    private int a;
    private List<bl_1> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<bl_1, bn_2, ba_2> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.ae;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.af.ensureFieldAccessorsInitialized(bw_2.class, by_1.class);
    }

    by_1() {
        this.m();
    }

    by_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (bw_2.k()) {
            this.o();
        }
    }

    public by_1 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.ae;
    }

    public bw_2 f() {
        return bw_2.h();
    }

    public bw_2 g() {
        bw_2 bw_22 = this.h();
        if (!bw_22.isInitialized()) {
            throw by_1.newUninitializedMessageException((Message)bw_22);
        }
        return bw_22;
    }

    public bw_2 h() {
        bw_2 bw_22 = new bw_2(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            bw_22.c = this.b;
        } else {
            bw_22.c = this.c.build();
        }
        this.onBuilt();
        return bw_22;
    }

    public by_1 i() {
        return (by_1)super.clone();
    }

    public by_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (by_1)super.setField(fieldDescriptor, object);
    }

    public by_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (by_1)super.clearField(fieldDescriptor);
    }

    public by_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (by_1)super.clearOneof(oneofDescriptor);
    }

    public by_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (by_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public by_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (by_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public by_1 a(Message message) {
        if (message instanceof bw_2) {
            return this.a((bw_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public by_1 a(bw_2 bw_22) {
        if (bw_22 == bw_2.h()) {
            return this;
        }
        if (this.c == null) {
            if (!bw_22.c.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = bw_22.c;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(bw_22.c);
                }
                this.onChanged();
            }
        } else if (!bw_22.c.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = bw_22.c;
                this.a &= 0xFFFFFFFE;
                this.c = bw_2.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(bw_22.c);
            }
        }
        this.b(bw_2.b(bw_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public by_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bw_2 bw_22 = null;
        try {
            bw_22 = (bw_2)bw_2.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bw_22 = (bw_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bw_22 != null) {
                this.a(bw_22);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<bl_1>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<bl_1> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public bl_1 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (bl_1)this.c.getMessage(n);
    }

    public by_1 a(int n, bl_1 bl_12) {
        if (this.c == null) {
            if (bl_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, bl_12);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)bl_12);
        }
        return this;
    }

    public by_1 a(int n, bn_2 bn_22) {
        if (this.c == null) {
            this.n();
            this.b.set(n, bn_22.l());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)bn_22.l());
        }
        return this;
    }

    public by_1 a(bl_1 bl_12) {
        if (this.c == null) {
            if (bl_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(bl_12);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)bl_12);
        }
        return this;
    }

    public by_1 b(int n, bl_1 bl_12) {
        if (this.c == null) {
            if (bl_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, bl_12);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)bl_12);
        }
        return this;
    }

    public by_1 a(bn_2 bn_22) {
        if (this.c == null) {
            this.n();
            this.b.add(bn_22.l());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)bn_22.l());
        }
        return this;
    }

    public by_1 b(int n, bn_2 bn_22) {
        if (this.c == null) {
            this.n();
            this.b.add(n, bn_22.l());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)bn_22.l());
        }
        return this;
    }

    public by_1 a(Iterable<? extends bl_1> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public by_1 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public by_1 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public bn_2 d(int n) {
        return (bn_2)this.o().getBuilder(n);
    }

    @Override
    public ba_2 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ba_2)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ba_2> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public bn_2 k() {
        return (bn_2)this.o().addBuilder((AbstractMessage)bl_1.m());
    }

    public bn_2 e(int n) {
        return (bn_2)this.o().addBuilder(n, (AbstractMessage)bl_1.m());
    }

    public List<bn_2> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bl_1, bn_2, ba_2> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final by_1 a(UnknownFieldSet unknownFieldSet) {
        return (by_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final by_1 b(UnknownFieldSet unknownFieldSet) {
        return (by_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

