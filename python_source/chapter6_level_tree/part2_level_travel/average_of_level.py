# coding=utf-8
import collections


from collections import deque

from python_source.chapter6_level_tree.part1_basic.Tree import Tree


class AverageOfLevels:
    def average_of_levels(self, root):
        averages = list()
        queue = collections.deque([root])
        while queue:
            total = 0
            size = len(queue)
            for _ in range(size):
                node = queue.popleft()
                total += node.val
                left, right = node.left, node.right
                if left:
                    queue.append(left)
                if right:
                    queue.append(right)
            averages.append(total / size)
        return averages


    def average_of_levels2(self, root):
        averages = list()
        queue = collections.deque([root])
        while queue:
            total = 0
            size = len(queue)
            for _ in range(size):
                node = queue.popleft()
                print node.val
                left, right = node.left, node.right
                if left:
                    queue.append(left)
                if right:
                    queue.append(right)


if __name__ == "__main__":
    tree = Tree()
    root = tree.init_tree()
    averageOfLevels = AverageOfLevels()
    res = averageOfLevels.average_of_levels2(root)
    # print res
