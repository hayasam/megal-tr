# Notes from Meeting 2016-06-28 

- The '#' in qualified fragment names may be misleading
- No DTD support for XML plugins!
- No further/automated fragment type specializations for XML
- XML ```realizationOf``` is actually ```conformsTo```!
- merge ```org.softlang.megal.mi2.Artifact``` and Fragment class, maybe: FragmentArtifact extends Artifact ???
- ```elementOf``` recovery for fragments seems problematic:
  1. a fragmentation plugin could be declared a ```realizationOf``` multiple languages in megal
  2. only the fragmentation plugin (the implementation) actually "knows" what languages the fragments are element of
  3. top-down deduction like  ```c elementOf L``` => ``c.p elementOf L``` could be logically invaild depending on what's to proof
