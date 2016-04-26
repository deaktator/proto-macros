package deaktator.proto

import com.google.protobuf.GeneratedMessage
import deaktator.proto.msgs.ProtoOps

/**
  * A convenient way to get a [[deaktator.proto.msgs.ProtoOps]] so that code reads better.  For instance,
  * using the PB
  * [[https://github.com/eHarmony/aloha-proto/blob/master/src/main/proto/com.eharmony.aloha.score.Scores.proto aloha-proto/Scores.proto]]:
  *
  * {{{
  * import com.eharmony.aloha.score.Scores.Score
  * val byteArray: Array[Byte] = ??? // ...
  * val score: Score = Proto[Score].parseFrom(byteArray)
  * }}}
  * @author deaktator
  */
object Proto {

  /**
    * A convenience method to retrieve a [[deaktator.proto.msgs.ProtoOps]] instance.
    * @param ops the instance to find via implicit resolution.
    * @tparam A the type of `GeneratedMessage`.
    * @return a [[deaktator.proto.msgs.ProtoOps]] for the desired `GeneratedMessage` type.
    */
  def apply[A <: GeneratedMessage](implicit ops: ProtoOps[A]): ProtoOps[A] = ops
}
