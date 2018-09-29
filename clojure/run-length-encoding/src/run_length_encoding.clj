(ns run-length-encoding)

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (frequencies plain-text)
  )

(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text]
  )

(run-length-encode "AABCDDD")
