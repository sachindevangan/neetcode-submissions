class TimeMap:

    def __init__(self):
        self.store = {} #created dictionary

    def set(self, key: str, value: str, timestamp: int) -> None:
        #agar key pehli baar aa rahi hai tw empty list 
        if key not in self.store:
            self.store[key] = []
        
        #timestamp or value store karo
        self.store[key].append((timestamp,value))

    def get(self, key: str, timestamp: int) -> str:
        #agar key exist nahi krti tw
        if key not in self.store:
            return ""

        pairs = self.store[key]
        left = 0
        right  = len(pairs) - 1
        result = ""

        while left <= right:
            mid = (left + right) // 2

            if pairs[mid][0] <= timestamp:
                result = pairs[mid][1]
                left = mid + 1
            
            else:
                right = mid - 1
        
        return result







